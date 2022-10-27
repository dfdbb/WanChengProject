package com.example.wanchengdemo.commom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice(annotations = {RestController.class})
public class GloableException {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public R<String> exceptionHandler (Exception e){

        log.info(("全局异常捕获>>>:"+e));
        return R.error("全局异常捕获,错误原因>>>"+e);
    }

}
