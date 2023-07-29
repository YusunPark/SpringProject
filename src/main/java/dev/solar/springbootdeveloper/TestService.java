package dev.solar.springbootdeveloper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; // 빈 주입

    public List<Member> getAllMembers() {
        return memberRepository.findAll(); //멤버 목록 얻기 (db에서)
    }


}
