package com.example.simplejpa.service;

import java.util.List;
import com.example.simplejpa.domain.Member;
import com.example.simplejpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public void postMember(String m_name,String m_email,String m_password)
    {
        memberRepository.post(m_name,m_email,m_password);
    }
    @Transactional
    public void deleteMember(Long id)
    {
        memberRepository.delete(id);
    }

    @Transactional(readOnly = true)
    public Member findOneByid(Long id)
    {
        return memberRepository.findOne(id);
    }
    @Transactional(readOnly = true)
    public List<Member> findAll()
    {
        return memberRepository.findALL();
    }
}
