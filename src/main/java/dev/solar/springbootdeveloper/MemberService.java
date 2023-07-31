package dev.solar.springbootdeveloper;

import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void test() {
        // 1. 생성
        memberRepository.save(new Member(1L, "A"));

        // 2. 조회
        Optional<Member> member = memberRepository.findById(1L);
        List<Member> allMembers = memberRepository.findAll();

        // 3. 삭제
        memberRepository.deleteById(1L);

    }

}
