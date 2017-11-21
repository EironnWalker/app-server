package com.weds.antd.appserver.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.weds.antd.appserver.cons.JWTConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class JWTUtils {

    private static final Log log = LogFactory.getLog(JWTUtils.class);

    /**
     * 获取token
     * @param userId
     * @return
     */
    public static String getTokenHMAC256(String userId) {
        try {
            Algorithm algorithmHS = Algorithm.HMAC256(JWTConstants.SECRET_KEY);
            String token = JWT.create()
                    .withIssuer(JWTConstants.ISSUER)
                    .withClaim("userId", userId)
                    .sign(algorithmHS);
            return Base64.getEncoder().encodeToString(token.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 校验token
     * @param token
     */
    public static int verifyTokenHMAC256(String token) {
        try {
            byte[] asBytes = Base64.getDecoder().decode(token);
            String deToken = new String(asBytes, "utf-8");
            Algorithm algorithmHS = Algorithm.HMAC256(JWTConstants.SECRET_KEY);
            JWTVerifier verifier = JWT.require(algorithmHS)
                    .withIssuer(JWTConstants.ISSUER)
                    .build();
            DecodedJWT jwt = verifier.verify(deToken);
            return 1;
        } catch (UnsupportedEncodingException e) {
            log.error("token校验失败!");
            log.error(e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        String token = getTokenHMAC256("111");
        System.out.println(token);
        verifyTokenHMAC256(token);
    }
}
