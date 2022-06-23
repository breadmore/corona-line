package com.breadmore.coronaline.dto;

import com.breadmore.coronaline.constant.ErrorCode;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse extends com.breadmore.coronaline.dto.APIErrorResponse {

    private final Object data;

    private APIDataResponse(boolean success, Integer errorCode, String message, Object data) {
        super(true, ErrorCode.OK.getCode(), ErrorCode.OK.getMessage());
        this.data = data;
    }

    public static APIDataResponse of(boolean success, Integer errorCode, String message, Object data) {
        return new APIDataResponse(success,errorCode,message,data);
    }

}
