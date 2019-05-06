package com.saber.winner.config;

import com.saber.winner.result.Result;
import com.saber.winner.result.ResultWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: GlobalDefultExceptionHandler
 * @Description:全局异常捕捉
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 17:14
 */
@ControllerAdvice
public class GlobalDefultExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalDefultExceptionHandler.class);


    /**声明要捕获的异常*/
    @ExceptionHandler(Exception.class)
    public Result<?> defultExcepitonHandler(HttpServletRequest request, Exception e) {
	 logger.error("=======>接口:{}执行发生异常，异常原因:",request.getRequestURL(),e);
     return ResultWrapper.systemError();
    }

//
//    @ExceptionHandler(Exception.class)
//    public Result<?> badRequestError() {
//        return ResultWrapper.statusError(HttpStatus.BAD_REQUEST);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public Result<?> notFoundError() {
//        return ResultWrapper.statusError(HttpStatus.NOT_FOUND);
//    }



}
