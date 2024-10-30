package com.spring.jay_diary.member.repository;

import com.spring.jay_diary.member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<String, Member> store = new HashMap<String, Member>();


    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(String id) {
        return store.get(id);
    }
}
