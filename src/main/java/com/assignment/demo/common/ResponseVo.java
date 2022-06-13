package com.assignment.demo.common;

import lombok.Data;

@Data
public class ResponseVo<T>{

    private String statusCode;
    private String message;
    private T data;

    public ResponseVo(String statusCode,String message,  T data) {
        this.message = message;
        this.statusCode = statusCode;
        this.data = data;
    }

    public static <T> ResponseVo<T> success(T data){
        return new ResponseVo<T>("00","success", data);
    }
    public static <T> ResponseVo<T> fail(String message, T data){
        return new ResponseVo<T>("01",message,data);
    }

}
