package com.aicrowdfunding.webUtil;

import io.jsonwebtoken.Claims;

public class JwtResult {
    //解析状态码
    private String statusCode;
    //解析状态语
    private String statusMsg;
    //解析后的Claim对象
    protected Claims claims;

    public JwtResult() {
    }

    public JwtResult(String statusCode, String statusMsg, Claims claims) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
        this.claims = claims;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }
}
