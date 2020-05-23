//package com.cnpc.gundeails.exceptionhandler;
//
//import com.cnpc.gundeails.enums.StateEnum;
//import com.cnpc.gundeails.exception.BusinessException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.validation.BindException;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.HttpRequestMethodNotSupportedException;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//
///**
// * Created by Panda on 2019/4/8.
// */
//@ControllerAdvice
//@Slf4j
//public class GlobalExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    Error Exception(Exception e, HttpServletRequest request){
//        //记录日志
//        log.info(request.getRequestURI()+ " "+e.getMessage());
//        return new Error("500", StateEnum.SYSTEM_ERROR.getMsg());
//    }
//
//
//    @ExceptionHandler(BusinessException.class)
//    @ResponseBody
//    Error businessException(BusinessException e, HttpServletRequest request){
//        //记录日志
//        log.info(request.getRequestURI()+ " "+e.getMessage());
//        return new Error(e.getCode(),e.getMessage());
//    }
//
//
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    @ResponseBody
//    Error HttpMessageNotReadableException(HttpMessageNotReadableException e, HttpServletRequest request){
//        //记录日志
//        log.info(request.getRequestURI()+ " "+e.getMessage());
//        return new Error(StateEnum.JSON_PARAM_NULL.getCode(),StateEnum.JSON_PARAM_NULL.getMsg());
//    }
//
//
//    @ExceptionHandler(BindException.class)
//    @ResponseBody
//    Error bindException(BindException e, HttpServletRequest request){
//        BindingResult result= e.getBindingResult();
//        int num = e.getBindingResult().getErrorCount();
//        StringBuilder msg = new StringBuilder();
//        for(int i = 0 ; i < num ; i++){
//            msg.append(result.getAllErrors().get(i).getDefaultMessage());
//            msg.append(",");
//        }
//        //记录日志
//        log.info(request.getRequestURI()+ " "+ msg.toString());
//        return new Error("602",msg.toString());
//    }
//
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseBody
//    Error methodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request){
//        BindingResult result= e.getBindingResult();
//        int num = e.getBindingResult().getErrorCount();
//        StringBuilder msg = new StringBuilder();
//        for(int i = 0 ; i < num ; i++){
//            msg.append(result.getAllErrors().get(i).getDefaultMessage());
//            msg.append(" ");
//        }
//        //记录日志
//        log.info(request.getRequestURI()+ " " + msg.toString());
//        return new Error("603",msg.toString());
//    }
//
//
//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//    @ResponseBody
//    Error httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e){
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        String jwtUser;
//        assert sra != null;
//        HttpServletRequest request = sra.getRequest();
//        String url = request.getRequestURI();
//        //记录日志
//        log.info(request.getRequestURI()+ " "+e.getMessage());
//        return new Error("501","requestUrl: "+ url+ " " + e.getMessage());
//    }
//}
