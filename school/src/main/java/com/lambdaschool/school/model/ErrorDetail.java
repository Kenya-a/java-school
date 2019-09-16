package com.lambdaschool.school.model;

import com.lambdaschool.school.exceptions.ValidationError;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail
{
    private String title;
    private int status;
    private String detail;
    private String timestamp;
    private String devMessage;
    private Map<String, List<ValidationError>> errors = new HashMap<>();

    //Getter and Setter


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Long timestamp)
    {
        this.timestamp = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z").format(new Date(timestamp));
    }

    public String getDevMessage()
    {
        return devMessage;
    }

    public void setDevMessage(String devMessage)
    {
        this.devMessage = devMessage;
    }

    public Map<String, List<ValidationError>> getErrors()
    {
        return errors;
    }

    public void setErrors(Map<String, List<ValidationError>> errors)
    {
        this.errors = errors;
    }
}
