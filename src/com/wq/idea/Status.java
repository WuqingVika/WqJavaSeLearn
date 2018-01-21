package com.wq.idea;

/**
 * Created by wuqingvika on 2018/1/21.
 * 主要测试列操作 批量将json数据转为枚举数据
 */
public enum Status {
    CONTINUE(100),
    OK(200),
    NOTFOUND(404);
    private int code;
    Status(int code) {
        this.code = code;
    }
}
