package com.zhoujc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auth: zhoujc
 * @Desc: 不分页-标准返回结果
 */
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = -2435089504958177374L;
    /**
     *  请求是否成功
     */
    private boolean flag;

    /**
     * 返回码，状态码
     */
    private Integer code;

    /**
     * 返回消息,消息提示
     */
    private String message;

    /**
     * 结果集列表
     */
    private Object data;

    /**
     * 功能描述: 无参构造
     *
     * @return :
     */
    public Result() {
    }

    /**
     * 功能描述: 没有数据集结果的有参构造
     *
     * @param flag    请求是否成功
     * @param code    请求返回状态码
     * @param message 请求返回消息提示
     * @return : 返回结果对象
     */
    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    /**
     * 功能描述: 有数据集结果的有参构造
     *
     * @param flag    请求是否成功
     * @param code    请求返回状态码
     * @param message 请求返回消息提示
     * @param data    返回页面数据
     * @return : 返回结果对象
     */
    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }


}
