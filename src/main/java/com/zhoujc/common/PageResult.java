package com.zhoujc.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 25975
 * @Auth: zhoujc
 * @Desc: 分页-标准返回结果
 */
@Data
public class PageResult implements Serializable {

    private static final long serialVersionUID = -6250130355901431732L;

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
     * 总条数
     */
    private Long total;

    /**
     * 功能描述: 无参构造
     * @return :
     */
    public PageResult() {
    }

    public PageResult(boolean flag, Integer code, String message, Object data, Long total) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
        this.total = total;
    }
}
