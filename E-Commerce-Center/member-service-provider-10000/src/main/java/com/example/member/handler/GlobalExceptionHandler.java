package com.example.member.handler;


import com.example.member.domain.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : RainbowJier
 * @date : 2024/6/13 18:04
 * @Version: 1.0
 * @Desc : 🐱‍🐉👀✔
 */
@RestControllerAdvice    // convert response to json.
public class GlobalExceptionHandler {
    // Alternatively, you can have a general exception handler
    @ExceptionHandler(value = Exception.class)
    public ResponseResult handleGenericException(Exception ex) {
        return ResponseResult.error(ex.getMessage());
    }

    // Custom exception handling type.
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseResult handleRuntimeException(RuntimeException ex) {
        return ResponseResult.error(ex.getMessage());
    }

    // Add more exception handlers as needed...


}