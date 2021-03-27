package com.example.admin.member;

import com.example.common.member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("user", "user@gmail.com");
    }
}
