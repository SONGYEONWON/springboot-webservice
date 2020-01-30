package com.demo.springboot.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // BaseTimeEntity  를 상속받은 클래스들에게 BaseTimeEntity 의 인자들을 컬럼으로 추가시킨다.
@EntityListeners(AuditingEntityListener.class) // Audit 기능을 사용하기 위한 설정
public abstract class BaseTimeEntity {

    //Entity 생성시 시간 자동저장
    @CreatedDate
    private LocalDateTime createdDate;
<<<<<<< HEAD
    private String testVar1;
    private String testVar2;
    private String testVar3;
=======
    private String testCherry;
>>>>>>> f57ade5... test

    //마지막 수정시간 자동저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
