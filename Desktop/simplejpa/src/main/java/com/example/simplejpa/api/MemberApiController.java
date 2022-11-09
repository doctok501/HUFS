package com.example.simplejpa.api;

import com.example.simplejpa.domain.Member;
import com.example.simplejpa.service.MemberService;
import jdk.nashorn.internal.ir.RuntimeNode;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import static com.example.simplejpa.dto.MemberDtos.*;

@RequiredArgsConstructor
@RestController
public class MemberApiController {
    private final MemberService memberService;
    @PostMapping(value = "/api/member", produces = "application/json;charset=UTF-8")
    public MemberResultResponse memberPost(@RequestBody MemberPostRequest request){
        memberService.postMember(request.getM_name(), request.getM_email(), request.getM_password());
        MemberPostResponse memberPostResponse = new MemberPostResponse(request.getM_name(), request.getM_email(), request.getM_password());
        return new MemberResultResponse("생성 완료",200, memberPostResponse);
    }

    @DeleteMapping(value = "/api/member", produces = "application/json;charset=UTF-8")
    public MemberResultResponse memberGetOne(@Param("memberId") Long memberId)
    {
        try{
            Member member = memberService.findOneByid(memberId);
            return new MemberResultResponse("호출 성공",200,member);
        }catch (NullPointerException e)
        {
            return new MemberResultResponse("no result", 400, null);
        }
    }

    @GetMapping(value = "/api/memberall", produces = "application/json;charset=UTF-8")
    public MemberResultResponse memberGetAll()
    {
        List<Member> findMembers = memberService.findAll();
        List<MemberDto> collect = findMembers.stream().map(m -> new MemberDto(m)).collect(Collectors.toList());
        return new MemberResultResponse("호출 성공", 200, collect);
    }

}
