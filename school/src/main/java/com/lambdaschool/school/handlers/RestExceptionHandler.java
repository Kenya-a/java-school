package com.lambdaschool.school.handlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//bean shared by the controller
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{
}
