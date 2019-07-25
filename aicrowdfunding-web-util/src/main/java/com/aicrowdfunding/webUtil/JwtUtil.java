package com.aicrowdfunding.webUtil;
import io.jsonwebtoken.*;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {

    //生成jwt
    public static String getJwt(String id,String iss, String sub,String aud,SecretKey secreteKey,Long ttl){
        JwtBuilder jwtBuilder= Jwts.builder();
        jwtBuilder.setId(id)
                .setIssuer(iss)
                .setSubject(sub)
                .setAudience(aud)
                .signWith(SignatureAlgorithm.RS256,secreteKey);
        if(ttl>0){
            Long currentTime=System.currentTimeMillis();
            Date expiration=new Date(currentTime+ttl);
            jwtBuilder.setExpiration(expiration);
        }
        return jwtBuilder.compact();
    }

    //将jwt解码获取Claims内容
    public static Claims parseJwt(String jwt){
        JwtParser parser = Jwts.parser();
        SecretKey secretKey = SecretKeyUtil.creatSecretKey();
       return parser.setSigningKey(secretKey)
                .parseClaimsJwt(jwt)  //抛出多个运行异常，如ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;
                .getBody();
    }

    //对jwt进行自身校验
    public static JwtResult validate(String jwt){
        JwtResult jwtResult=new JwtResult();
        try {
            Claims claims = parseJwt(jwt);
            jwtResult.setStatusCode("200");
            jwtResult.setStatusMsg("解析成功");
            jwtResult.setClaims(claims);
        }catch (ExpiredJwtException expiredJwtException){
            jwtResult.setStatusCode("601");
            jwtResult.setStatusMsg("jwt已过期");
        }catch (UnsupportedJwtException unsupportedJwtException) {
            jwtResult.setStatusCode("602");
            jwtResult.setStatusMsg("不支持的jwt");
        }catch (MalformedJwtException malformedJwtException) {
            jwtResult.setStatusCode("603");
            jwtResult.setStatusMsg("jwt格式错误");
        }catch (SignatureException signatureException) {
            jwtResult.setStatusCode("604");
            jwtResult.setStatusMsg("jwt签名错误");
        }catch (IllegalArgumentException illegalArgumentException) {
            jwtResult.setStatusCode("605");
            jwtResult.setStatusMsg("jwt参数错误");
        }finally {
            return jwtResult;
        }
    }
}
