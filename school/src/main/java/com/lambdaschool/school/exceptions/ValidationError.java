package com.lambdaschool.school.exceptions;

public class ValidationError
{
    private String code;
    private String message;

    //Getter and Setter


    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
