package hello.JPAshopreview.service;


import hello.JPAshopreview.domain.Member;
import hello.JPAshopreview.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberRepository memberRepository;

    @Autowired MemberService memberService;

    @Test
    public void 회원가입() throws Exception{
        //given
        Member member = new Member();
        member.setName("kim");
        //when
        Long saveId = memberService.Join(member);
        Member saveName = memberRepository.findOne(saveId);

        //then
        Assertions.assertThat(saveName.getName()).isEqualTo("kim");

    }

    @Test
    public void 중복_예외() throws Exception{
        //given
        Member member = new Member();
        member.setName("kimchi");

        Member member2 = new Member();
        member2.setName("kimchi");
        //when
        memberService.Join(member);

        //then
        Assertions.assertThatThrownBy(() -> memberService.Join(member2))
                .isInstanceOf(IllegalStateException.class);

    }

}