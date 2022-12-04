package com.example.simplejpa.dto;

import com.example.simplejpa.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MemberDtos {

    @Data
    @AllArgsConstructor
    public static class MemberResultResponse<T>
    {
        private String message;
        private int status;
        private T data;
    }
    @Data
    @AllArgsConstructor
    public static class MemberMessageResponse
    {
        private String message;
        private int status;
    }
    @Data @AllArgsConstructor
    public static class MemberPostResponse
    {
        private String m_name;
        private String m_email;
        private String m_password;

    }

    @Data @NoArgsConstructor
    public static class MemberPostRequest
    {
        private String m_name;
        private String m_email;
        private String m_password;
    }
    @Data @AllArgsConstructor
    public static class MemberIdRequest
    {
        private Long id;
    }
    @Data
    public static class MemberDto{
        private long id;
        private String name;
        private String password;
        private String email;

        public MemberDto(Member member){
            this.id = member.getId();
            this.name = member.getM_name();
            this.password = member.getM_password();
            this.email = member.getM_email();
        }
    }
}
