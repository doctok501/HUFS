package com.example.simplejpa2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

public class OrderDtos {
    @Data
    @NoArgsConstructor
    public static class OrderGetRequest
    {
        private String m_name;
    }

    @Data
    @NoArgsConstructor
    public static class OrderPostRequest
    {
        private Long memberId;
        private String o_name; // 주문상품이름
        private int count ;

    }

}
