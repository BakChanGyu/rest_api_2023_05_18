package com.ll.rest.rest_api.base.rsData;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.rest.rest_api.boundedContext.member.controller.MemberController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;

    public static <T> RsData<T> of(String resultCode, String msg, T data) {
        return new RsData<>(resultCode, msg, data);
    }

    public static <T> RsData<T> of(String resultCode, String msg) {
        return of(resultCode, msg, null);
    }

    @JsonIgnore
    public boolean isSuccess() {
        return resultCode.startsWith("S-");
    }

    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }
}
