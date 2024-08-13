package com.nicson.apipostgres.resources.exceptions;

import java.io.Serializable;
import java.util.Date;

public class StandardError implements Serializable {
    private Date date;
    private Integer status;
    private String error;
    private String path;

    public StandardError() {
    }

    public StandardError(Date date, Integer status, String error, String path) {
        this.date = date;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
