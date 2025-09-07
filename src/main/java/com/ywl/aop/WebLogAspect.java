package com.ywl.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class WebLogAspect {

    /**
     * 配置切入点，匹配controller包下所有类的所有方法
     */
    @Pointcut("execution(public * com.ywl.controller..*.*(..))")
    public void webLog() {
    }

    /**
     * 环绕通知，处理日志记录
     */
    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        // 获取当前请求信息
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if (attributes != null) {
            request = attributes.getRequest();
        }

        // 记录请求信息
        if (request != null) {
            log.info("REQUEST: {} {} params: {}",
                    request.getMethod(),
                    request.getRequestURL().toString(),
                    Arrays.toString(joinPoint.getArgs()));
        } else {
            log.info("REQUEST: method={} params={}",
                    joinPoint.getSignature().getName(),
                    Arrays.toString(joinPoint.getArgs()));
        }

        Object result;
        try {
            // 执行目标方法
            result = joinPoint.proceed();

            // 记录响应结果
            if (result != null && !ObjectUtils.isEmpty(result)) {
                log.info("RESPONSE: {} cost={} ms", result, System.currentTimeMillis() - startTime);
            } else {
                log.info("RESPONSE: null cost={} ms", System.currentTimeMillis() - startTime);
            }
        } catch (Exception e) {
            log.error("EXCEPTION: {} cost={} ms", e.getMessage(), System.currentTimeMillis() - startTime);
            throw e;
        }

        return result;
    }
}
