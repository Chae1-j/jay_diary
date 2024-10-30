package com.spring.jay_diary.member.service;

import com.spring.jay_diary.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMemberById(String id);
}
