package me.taehwee.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
