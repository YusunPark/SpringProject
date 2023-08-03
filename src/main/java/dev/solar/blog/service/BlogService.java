package dev.solar.blog.service;

import dev.solar.blog.domain.Article;
import dev.solar.blog.dto.AddArticleRequest;
import dev.solar.blog.repository.BlogRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 서비스 메서드 코드 작성 (데이터베이스와 연결)
@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {
    private  final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 블로그 글 목록 조회 메서드
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

}
