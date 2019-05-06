package com.saber.winner.model.query;

/**
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  saber
 *
 * @ClassName: LoginParam
 * @Description: 登录参数
 * @version: v1.0.0
 * @author: saber
 * @date: 2019-05-06 16:39
 */
public class LoginParam {

    /**
     * 域账号
     */
    private String userAccount;
    /**
     * 密码
     */
    private String passWord;

    public String getUserAccount() {
        return userAccount;
    }

    public LoginParam setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public LoginParam setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public LoginParam(String userAccount, String passWord) {
        this.userAccount = userAccount;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LoginParam{");
        sb.append("userAccount='").append(userAccount).append('\'');
        sb.append(", passWord='").append(passWord).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
