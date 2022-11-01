package com.example.wanchengdemo.util;

import com.example.wanchengdemo.entity.CheckResult;
import com.example.wanchengdemo.entity.SystemConstant;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.IOException;
import io.jsonwebtoken.security.Keys;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Date;

@Data
@Component
@Slf4j
public class JwtUtil {
    /**
     * 生成足够的安全随机密钥，以适合符合规范的签名
     */
    private static byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SystemConstant.JWT_SECRET_KEY);
    private static SecretKey secretKey = Keys.hmacShaKeyFor(apiKeySecretBytes);

    /**
     * 创建JWT
     *
     * @param subject      主体，用户名
     * @param isRememberMe 记住我
     * @return
     */
    public static String createJWT(String id, String subject, Long ttlMillis) throws IOException {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        JwtBuilder builder = Jwts.builder()
                .setId(id) // 是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setSubject(subject)   // 代表这个JWT的主体，即它的所有人，这个是一个json格式的字符串，可以存放什么userid，roldid之类的，作为什么用户的唯一标志
                .setIssuer("user")     // 颁发者是使用 HTTP 或 HTTPS 方案的 URL（区分大小写），其中包含方案、主机及（可选的）端口号和路径部分
                .setIssuedAt(now)      // jwt的签发时间
                .signWith(SignatureAlgorithm.HS256, secretKey); // 设置签名使用的签名算法和签名使用的秘钥
        if (ttlMillis > 0) {
            long expMillis = nowMillis + ttlMillis;
            Date expDate = new Date(expMillis);
            builder.setExpiration(expDate); // 过期时间
        }
        return builder.compact();
    }

    /**
     * 验证JWT
     *
     * @param jwtStr
     * @return
     */
    public static CheckResult validateJWT(String jwtStr) {
        CheckResult checkResult = new CheckResult();
        try {
            Claims claims = parseJWT(jwtStr);
            checkResult.setSuccess(true);
            checkResult.setClaims(claims);
        } catch (ExpiredJwtException e) {
            checkResult.setErrCode(SystemConstant.JWT_ERRCODE_EXPIRE);
            checkResult.setSuccess(false);
        } catch (Exception e) {
            checkResult.setErrCode(SystemConstant.JWT_ERRCODE_FAIL);
            checkResult.setSuccess(false);
        }
        return checkResult;
    }
    public static String getUsernameByToken(String token) {
        return parseJWT(token).getSubject();
    }

    /**
     * 解析JWT
     *
     * @param token
     * @return
     */
    private static Claims parseJWT(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}