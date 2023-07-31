package dev.solar.blog.repository;

import dev.solar.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// Long을 받는 이유 -> 엔티티의 pk인 Id 의 타입을 넣어준 것이다.
// 이렇게 JpaRepository를 상속받음으로써 JPA가 제공하는 여러 메서드를 사용할 수 있다.
public interface BlogRepository extends JpaRepository<Article, Long> {

}
