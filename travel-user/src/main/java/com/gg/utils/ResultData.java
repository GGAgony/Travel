package com.gg.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author fzhuoxing
 * @Time 2022/7/6 3:28 下午
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ResultData<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回的响应编码
     */
    private Integer code;

    /**
     * 返回的响应消息
     */
    private String message;

    /**
     * 返回业务数据对象,如果数据为null，不进行序列化
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;


    /**
     * 返回成功的消息
     */
    public static ResultData<String> ok() {
        return new ResultData(GlobalCodeEnum.SUCCESS_000, null);
    }

    /**
     * 返回成功的响应数据
     */
    public static <T> ResultData<T> ok(T data) {
        return new ResultData(GlobalCodeEnum.SUCCESS_000, data);
    }


    /**
     * 返回失败的消息
     */
    public static ResultData<String> fail() {
        return new ResultData(GlobalCodeEnum.INTERNAL_SERVER_ERROR, null);
    }

    /**
     * 返回失败的消息
     */
    public static <T> ResultData<T> fail(T data) {
        return new ResultData(GlobalCodeEnum.INTERNAL_SERVER_ERROR, data);
    }

    /**
     * 返回失败的消息
     */
    public static <T> ResultData<T> fail(GlobalCodeEnum globalCodeEnum, T data) {
        return new ResultData(globalCodeEnum, data);
    }


    /**
     * 构造函数
     */
    private ResultData(GlobalCodeEnum globalCodeEnum, T data) {
        this.code = globalCodeEnum.getCode();
        this.message = globalCodeEnum.getDescription();
        this.data = data;
    }

    /**
     * 返回系统指定的异常错误
     */
    public static ResultData<String> systemException(GlobalCodeEnum globalCodeEnum) {
        return new ResultData<>(globalCodeEnum, null);
    }

    /**
     * 返回系统指定的异常错误
     */
    public static <T> ResultData<T> systemException(GlobalCodeEnum globalCodeEnum, T data) {
        return new ResultData<>(globalCodeEnum, data);
    }
}
