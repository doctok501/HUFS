package com.example.simplejpa2.service;

import com.example.simplejpa2.domain.Member;
import com.example.simplejpa2.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member member) {

        validateDuplicateMember(member); 
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getM_name());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    @Transactional
    public void deleteMember(Long id)
    {
        memberRepository.delete(id);
    }

    public List<Member> findMembers() {
        return memberRepository.findALL();
    }

    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }


}
