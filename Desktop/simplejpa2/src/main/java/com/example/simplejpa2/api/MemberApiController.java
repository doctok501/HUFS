package com.example.simplejpa2.api;


import com.example.simplejpa2.domain.Address;
import com.example.simplejpa2.domain.Member;
import com.example.simplejpa2.dto.MemberDtos;
import com.example.simplejpa2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class MemberApiController {
    private final MemberService memberService;

    @PostMapping(value="/api/member" , produces = "application/json;charset=UTF-8")
    public MemberDtos.MemberResultResponse memberpost(@RequestBody MemberDtos.MemberPostRequest form) {


        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());

        Member member = new Member();
        member.setM_name(form.getM_name());
        member.setM_address(address);
        memberService.join(member);

        MemberDtos.MemberPostResponse memberPostResponse = new MemberDtos.MemberPostResponse(member);
        return new MemberDtos.MemberResultResponse("this is my first spring",200,memberPostResponse);
    }

    @GetMapping(value="/api/members" , produces = "application/json;charset=UTF-8")
    public MemberDtos.MemberResultResponse membersGet() {
        List<Member> findMembers = memberService.findMembers();
        List<MemberDtos.MemberDto> collect = findMembers.stream().map(m -> new MemberDtos.MemberDto(m,m.getM_address())).collect(Collectors.toList());
        return new MemberDtos.MemberResultResponse("this is my first spring",200,collect);
    }

}
