package com.acompany.springdemo.advice;

import com.acompany.springdemo.annotation.TokenRequired;
import com.acompany.springdemo.impl.SecurityServiceImpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.xml.bind.DatatypeConverter;

@Aspect
@Component
public class SecurityAspect {

    @Before("@annotation(tokenRequired)")
    public void authWithToken(TokenRequired tokenRequired) {
        ServletRequestAttributes reqAttributes =
                (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = reqAttributes.getRequest();
        String tokenInHeader = request.getHeader("token");
        if(StringUtils.isEmpty(tokenInHeader)){
            throw new IllegalArgumentException("Empty Token");
        }
        Claims claims = Jwts.parser().setSigningKey(
                DatatypeConverter.parseBase64Binary(
                        SecurityServiceImpl.secretKey)).build()
                .parseClaimsJws(tokenInHeader).getBody();
        if(claims == null || claims.getSubject() == null){
            throw new IllegalArgumentException("Token error: claim is null");
        }

        System.out.println("토크엔 포함된 subject로 자체 인증 필요...");

    }
}
