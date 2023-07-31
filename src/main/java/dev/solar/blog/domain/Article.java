package dev.solar.blog.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter // Getter 애너테이션으로 get메서드 적지 않음
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자 애너테이션
public class Article {

    @Id // id 필드를 기본키로 지정한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가하도록
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // title이라는 not null컬럼과 매핑한다.
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    // 롬복에서 지원하는 애너테이션
    @Builder // 빌더 패턴으로 객체 작성 (명시적으로 확인 가능)
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
