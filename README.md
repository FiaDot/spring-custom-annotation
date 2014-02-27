spring-custom-annotation
========================

Spring framework + Custom annotation (AOP)

# 목적 

spring에서 @CheckLogin - custom annotation - 을 사용하기 위한 샘플


# Test 

1. 호출 
http://localhost:8081/SpringCustomAnnotation/sayhello

2. 로그 확인
    WARN : com.fullstackstarter.SpringCustomAnnotation.CheckLoginAspect - check login
    INFO : com.fullstackstarter.SpringCustomAnnotation.HomeController - sayHello

