package com.spring.jay_diary.member;

import com.spring.jay_diary.member.service.MemberService;
import com.spring.jay_diary.member.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given
        Member member = new Member("test","테스트", 22, "021001","01010041004","test1@test.co.kr");

        // when
        memberService.join(member);
        Member findMember = memberService.findMemberById("test");

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
