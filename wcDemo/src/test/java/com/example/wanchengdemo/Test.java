package com.example.wanchengdemo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.wanchengdemo.util.TestJwt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    @org.junit.Test
    public void test(){
        String token = JWT.create()
                .withClaim("username", "young")
                .withClaim("pwd", "999")
//                .withExpiresAt(new Date(System.currentTimeMillis()))//过期时间
                .sign(Algorithm.HMAC384("test"));  //签名　

        System.out.println(token);
    }

    @org.junit.Test
    public void testP(){
        //创建验证对象
        JWTVerifier verification = JWT.require(Algorithm.HMAC384("test")).build();
        DecodedJWT verify = verification.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJwd2QiOiI5OTkiLCJ1c2VybmFtZSI6InlvdW5nIn0.8nP0a1whM5SviX01kgj-U1U1bA2-ll-YONkwdwgyzovXS4T5N12sUY-K7AI6feZD");
        System.out.println(verify.getClaim("username"));
        System.out.println(verify.getClaim("pwd"));


    }

    @org.junit.Test
    public void TestToken(){
        System.out.println(TestJwt.get("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJ5b3VuZyIsImV4cCI6MTY2NTgxNzA5MywiaWF0IjoxNjY1ODEzNDkzfQ.BErKFf3v0sMhDhYXdDtRMoCOmgSFF8pVvvcKTLxyzfE","username"));


    }

    @org.junit.Test
    public void get(){

    }

    @org.junit.Test
    public void reg(){
        String str = "我是二年级一班的小名";
        String reg = ".年级.班";

        Pattern pattern = Pattern.compile (reg);
        Matcher matcher = pattern.matcher (str);

        while (matcher.find ())
        {
            System.out.println (matcher.group ());
        }
    }

}
