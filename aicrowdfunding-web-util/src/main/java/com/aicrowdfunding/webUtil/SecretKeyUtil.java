package com.aicrowdfunding.webUtil;

import javax.crypto.spec.SecretKeySpec;

public class SecretKeyUtil {
    private final static String SECRETE_KEY="fabio";

    //生成密钥
    public static javax.crypto.SecretKey creatSecretKey() {
        try {
            byte[] bytes=SECRETE_KEY.getBytes();
            return new SecretKeySpec(bytes,0,bytes.length,"AES");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
