package com.redscarf.smart.common.constants;

/**
 * 通用web层接口返回码
 *
 * @Auther ShuBifeng
 * @Date 2017-05-10
 */
public enum CommonCode implements Code {
    /**
     * 正常响应逻辑
     */
    SUCCESS(0, "成功"),
    FAIL(-1, "处理失败"),
    UNKNOWN(-2, "未知错误"),
    NULL_EXCEPTION(-3, "空指针异常"),
    NOT_LOGIN_IN(-4, "未登录"),
    PARAM_ERROR(-5, "参数错误"),
    NOT_AUTH_REQUEST(-6, "非法请求"),
    FILE_UPLOAD_ERR(-7, "文件为空"),
    REQUEST_METHOD_ERR(-8, "http方法不适用"),
    REQUEST_CONTENTYPE_ERR(-9, "content type错误"),
    EXISTS_DATA(-10, "数据已存在"),
    NOT_PERMISSIONS(-11, "没有权限"),
    NOT_EXISTS_RESOURCE(-12, "资源不存在"),
    RPC_ERROR(-13, "RPC链接错误"),
    NO_TOKEN_PARAM(-14, "缺失TOKEN"),
    TOKEN_NOT_EXISTS(-15, "TOKEN超时"),
    CODE_INVALID(-16, "code无效"),
    CAPTCHA_INVALID(-17, "验证码不对"),
    DATA_NOT_PERMISSION(-18, "数据权限不足"),
    SYSTEM_NOT_USERINFO(-19, "子系统获取当前用户异常"),
    SYSTEM_NOT_USER_MENU(-20, "子系统获取当前用户菜单异常"),
    SYSTEM_NOT_USER_DEPT(-21, "子系统获取当前用户部门异常"),
    SYSTEM_NOT_USER_ROLE(-22, "子系统获取当前用户角色异常"),
    SYSTEM_NOT_USER_COMPANY(-23, "子系统获取当前用户企业异常"),
    LOGIN_AFTER_LOGOUT(-24, "退出再登录"),
    USER_UPDATE_AND_LOGIN(-25, "用户信息变更,请重新登录"),
    USER_CUR_COMPANY(-50, "请选择用户当前公司"),
    USER_CUR_SYSTEM(-51, "请选择用户当前系统"),
    USER_ERROR_SYSTEM(-52, "用户当前系统与请求不对"),
    // 61 警告,非异常
    COMPANY_ADMIN_THE_SAME_TO_OLD(61,"企业设置新管理员与旧的是同一个用户"),
    NO_TICKET_PARAM(-101, "缺失ticket"),
    TICKET_TIMEOUT(-102, "ticket过期"),

    ORDER_NOT_EXIST(2001,"订单不存在"),
    ORDER_CANCELED(2002,"订单取消"),
    ;

    private Integer code;
    private String message;

    CommonCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.message;
    }

}
