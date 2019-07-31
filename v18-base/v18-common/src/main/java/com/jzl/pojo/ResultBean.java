package com.jzl.pojo;

/**
 * 项目名：v18
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-07-29 下午 9:06
 */
public class ResultBean<T> {

    private String statusCode;

    private T data;

    public ResultBean() {
    }

    public ResultBean(String statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
