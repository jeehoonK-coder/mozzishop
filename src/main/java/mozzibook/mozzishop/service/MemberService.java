package mozzibook.mozzishop.service;


import lombok.RequiredArgsConstructor;
import mozzibook.mozzishop.domain.Member;
import mozzibook.mozzishop.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;

    /**
     * 회원가입
     */
    @Transactional
    public Long join(Member member){
        //중복검증?
        return memberRepository.save(member);
    }

    /**
     *  로그인
     */

    public Long singIn(String email, String password){

        //회원이 없을 경우 체크
        Member member = memberRepository.findByEmail(email);
        if(member.getPassword().equals(password)){
            return member.getId();
        }
        //비번이 틀렷을 경우 체크
        return 0L;
    }

    /**
     * 회원조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Member findOne(Long memberId){
        return memberRepository.findOne(memberId);
    }




}
