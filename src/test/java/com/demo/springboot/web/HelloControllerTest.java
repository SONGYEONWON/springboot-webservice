package com.demo.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//Junit 에 포함된 실행자가 아닌, Spring Boot 의 실행자를 연결한다.
@RunWith(SpringRunner.class)
// @Controller 를 호출하는 테스트에 사용된다.
@WebMvcTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc; // MockMvc API 테스트에 사용된다.


    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }


}
