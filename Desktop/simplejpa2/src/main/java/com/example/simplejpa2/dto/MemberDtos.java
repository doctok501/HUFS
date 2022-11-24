package com.example.simplejpa2.dto;

import com.example.simplejpa2.domain.Address;
import com.example.simplejpa2.domain.Member;
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

    @Data @AllArgsConstructor
    public static class MemberPostResponse
    {
        private String m_name;
        private String city;
        private String street;
        private String zipcode;

        public MemberPostResponse(Member member) {
            this.m_name = member.getM_name();
            this.city = member.getM_address().getCity();
            this.street = member.getM_address().getStreet();
            this.zipcode = member.getM_address().getZipcode();
        }
    }
    @Data @NoArgsConstructor
    public static class MemberPostRequest
    {

        private String m_name;
        private String city;
        private String street;
        private String zipcode;

    }

    @Data
    public static class MemberDto{
        private Long id;
        private String m_name;
        private String m_password;
        private String m_email;
        private Address m_address;

        public MemberDto(Member member, Address m_address) {
            this.id = member.getId();
            this.m_name = member.getM_name();
            this.m_password = member.getM_password();
            this.m_email = member.getM_email();
            this.m_address = m_address;
        }
    }


}
