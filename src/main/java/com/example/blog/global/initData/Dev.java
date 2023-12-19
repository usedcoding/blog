package com.example.blog.global.initData;

import com.example.blog.domain.member.entity.Member;
import com.example.blog.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Profile("dev")
@Configuration
public class Dev {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public ApplicationRunner init(MemberService memberService) {
        return args -> {
            memberService.join("admin", "1234", "admin", "admin@test.com");
            memberService.join("member1", "1234", "member1", "test1@test.com");
            memberService.join("member2", "1234", "member2", "test2@test.com");
        };

    }
}
