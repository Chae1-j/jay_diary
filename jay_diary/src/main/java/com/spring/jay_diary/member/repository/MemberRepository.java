package com.spring.jay_diary.member.repository;

import com.spring.jay_diary.member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(String id);
}
