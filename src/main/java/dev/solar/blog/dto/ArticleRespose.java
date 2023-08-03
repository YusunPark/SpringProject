package dev.solar.blog.dto;

import dev.solar.blog.domain.Article;
import lombok.Getter;

// 컨트롤러 메서드 코드
//응답을 위한 DTO 작성
@Getter
public class ArticleRespose {
    private final String title;
    private final String content;

    public ArticleRespose(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
