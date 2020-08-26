package com.dongwon.book.domain.posts;

import com.dongwon.book.damain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 어노테이션 순서를 주요 어노테이션을 클래스에 가깝게 둠.
@Getter // 롬복 어노테이
@NoArgsConstructor // 롬복 어노테이션
@Entity // JPA 어노테이션션으로 테이블과 링크될 클래스, 기본값으로 클래스의 카멜 케이스 이름을 언더스코어 네이밍으로 테이블 이름을 매칭한다.
public class Posts extends BaseTimeEntity {
    // Entity 클래스에서 절대 Setter 메소드를 만들지 않는다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

