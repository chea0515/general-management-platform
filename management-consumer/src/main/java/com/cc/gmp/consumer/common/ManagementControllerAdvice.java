package com.cc.gmp.consumer.common;

import com.cc.util.ResultError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class ManagementControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResultError runtimeExceptionHandler(RuntimeException ex) {
        log.error("RuntimeException:{}", ex.getMessage());
        return ResultError.error(500, ex.getMessage());
    }

    @ExceptionHandler(ManagementException.class)
    @ResponseBody
    public ResultError bmsExceptionHandler(ManagementException ex) {
        log.error("BmsException:{}", ex.getMessage());
        return ResultError.error(500, ex.getMessage());
    }
}
