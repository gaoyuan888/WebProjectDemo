package com.zyx.datasource;

import com.zyx.service.ItemService;
import com.zyx.service.ItemService1;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

    @Around("execution(* com.zyx.service.*.*(..))")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
        if (jp.getTarget() instanceof ItemService) {
            MultipleDataSource.setDataSourceKey("dataSource1");
        } else if (jp.getTarget() instanceof ItemService1) {
            MultipleDataSource.setDataSourceKey("dataSource2");
        }
        return jp.proceed();
    }
}