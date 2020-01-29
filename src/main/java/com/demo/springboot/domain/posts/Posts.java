package com.demo.springboot.domain.posts;

import com.demo.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // Setter 는 생성 하지 않는다 값의 변경이 필요한경우 업무로직에 맞는 기능을 생성하여 사용한다.
@NoArgsConstructor
@Entity //JPA annotation 테이블과 링크될 클래스임을 나타낸다.  카멜케이스 + 언더스코어 사용 SalesManager -> sales_manager
public class Posts extends BaseTimeEntity {

    @Id // PK 필드임을 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성규칙 - GenerationType.IDENTITY <- Auto increment
    private Long id;

    @Column(length = 500, nullable = false) // 컬럼 특성 설정
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author; // 특별한 설정이 필요없으면 @Column 없어도 된다.

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}