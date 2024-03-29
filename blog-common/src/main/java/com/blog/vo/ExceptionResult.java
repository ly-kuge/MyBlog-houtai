package com.blog.vo;

import com.blog.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author ly
 * @date 2018/9/15
 *
 * 自定义异常结果类
 */

@Data
public class ExceptionResult {

    private int status;

    private String message;

    private long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.value();
        this.message = em.message();
        this.timestamp = System.currentTimeMillis();
    }
}
