package com.saber.winner.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: JwtTokenUtil
 * @Description: JWT工具类
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 16:47
 */
public class JwtTokenUtil {
    private static final Logger logger = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String PRIVATE_KEY = "GAPOW1,1";

    /**
     *
     * 生成jwt token
     * @param userId
     * @return
     */
    public String buildJwt(Integer userId,String entrancKey) {
            String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, PRIVATE_KEY)//SECRET_KEY是加密算法对应的密钥，这里使用额是HS256加密算法
             //   .setExpiration(DateTime.now().plusDays(Integer.parseInt(outDate)).toDate()) //expTime是过期时间
                .claim("userId", userId) //该方法是在JWT中加入值为vaule的key字段
                .setIssuedAt(new Date())
                .compact();
        return jwt;
    }


//    public Boolean isJwtValid(String  jwt) {
//        String token = "";
//            //解析JWT字符串中的数据，并进行最基础的验证
//            Claims claims = Jwts.parser()
//                    //SECRET_KEY是加密算法对应的密钥，jwt可以自动判断机密算法
//                    .setSigningKey(PRIVATE_KEY)
//                    .parseClaimsJws(jwt)
//                    .getBody();
//
//            Integer vaule = claims.get("userId", Integer.class);
//            logger.info("用户ID|{}", vaule);
//
//            //判断自定义字段是否正确
//            return ResponseWrapper.assembleResultInfo(ReturnCode.Token_AUTH_SUCCESS.getCode(), ReturnCode.Token_AUTH_SUCCESS.getMsg(), vaule);
//        }
//
//        //在解析JWT字符串时，如果密钥不正确，将会解析失败，抛出SignatureException异常，说明该JWT字符串是伪造的
//            return ResponseWrapper.assembleResultInfo(ReturnCode.TOKEN_FAIL.getCode(), ReturnCode.TOKEN_FAIL.getMsg());
//        //在解析JWT字符串时，如果‘过期时间字段’已经早于当前时间，将会抛出ExpiredJwtException异常，说明本次请求已经失效
//        catch (ExpiredJwtException e) {
//            return ResponseWrapper.assembleResultInfo(ReturnCode.TOKEN_TIMEOUT.getCode(), ReturnCode.TOKEN_TIMEOUT.getMsg());
//        }
//
//    }

}
