package dev.solar.blog.controller;

import dev.solar.blog.domain.Article;
import dev.solar.blog.dto.AddArticleRequest;
import dev.solar.blog.dto.ArticleRespose;
import dev.solar.blog.service.BlogService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //final , notnull 의 생성자를 생성
@RestController // http response body 에 객체 데이터를 json형식으로 반환하는 컨트롤러
public class BlogApiController {
    private final BlogService blogService;

    //http 메서드가 post일때 전달받은 url과 동일하면 메서드로 매핑
    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        // 요청한 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 응답 객체에 담아 전송
        // RestController 의 역할 때문에
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }

    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleRespose>> findAllArticles() {
        List<ArticleRespose> articles = blogService.findAll()
                .stream()
                .map(ArticleRespose::new)
                .toList();

        // 스트림 : 여러 데이터가 모여있는 컬렉션을 간편 처리 기능 : 자바 8 추가
        return ResponseEntity.ok()
                .body(articles);
    }


}
