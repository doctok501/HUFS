package com.example.simplejpa2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ResultDtos {

    @Data
    @AllArgsConstructor
    public static class ResultResponseData<T>
    {
        private String message;
        private int status;
        private T data;
    }

    @Data
    @AllArgsConstructor
    public static class ResultResponseMessage
    {
        private String message;
        private int status;
    }

}
