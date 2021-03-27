package com.example.api.service;

import com.example.common.member.Member;
import com.example.common.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long singup (Member member) {
        return memberRepository.save(member).getId();
    }
}
