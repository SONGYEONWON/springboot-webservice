package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동을 설정한다.
// @SpringBootApplication 부터 읽어들어가므로 항상 프로젝트 최상단에 위치해야한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //내장 WAS 실행!
        SpringApplication.run(Application.class, args);
    }
}
