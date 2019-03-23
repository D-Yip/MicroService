package com.ysj.user.response;

import java.io.Serializable;

public class Response implements Serializable {

    public static final Response USERNAME_PASSWORD_INVALID = new Response(1001,"username or password error");

    public static final Response MOBILE_AND_EMAIL_REQUIRE = new Response(1002,"mobile and email is required");

    public static final Response SEND_VERIFYCODE_FAILED = new Response(1003,"send verify code failed");

    public static final Response VERIFY_CODE_INVALID = new Response(1004,"verify code invalid");

    public static final Response SUCCESS = new Response();

    private int code;

    private String message;

    public static Response exception(Exception e){
        return new Response(9999,e.getMessage());
    }

    public Response() {
        this.code = 0;
        this.message = "success";
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
