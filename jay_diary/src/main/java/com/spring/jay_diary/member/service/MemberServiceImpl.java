package com.spring.jay_diary.member.service;

import com.spring.jay_diary.member.Member;
import com.spring.jay_diary.member.repository.MemberRepository;
import com.spring.jay_diary.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMemberById(String id) {
        return memberRepository.findById(id);
    }
}
