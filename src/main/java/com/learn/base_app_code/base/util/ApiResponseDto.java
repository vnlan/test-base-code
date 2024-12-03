package com.learn.base_app_code.base.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ApiResponseDto<T> {
    private Integer status;
    private String messageTitle;
    private String message;
    private T data;
}
