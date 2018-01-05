package com.zstax.demo.bean;

/**
 * 描述:t_user表的实体类
 * @tableRemark:
 * @version
 * @author:  Administrator
 * @创建时间: 2018-01-05
 */
public class User extends Object {
    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String phone;

    /** 
     * 获取 t_user.user_id
     * @return t_user.user_id
     */
    public final Integer getUserId() {
        return userId;
    }

    /** 
     * 设置 t_user.user_id
     * @param userId t_user.user_id
     */
    public final void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 
     * 获取 t_user.user_name
     * @return t_user.user_name
     */
    public final String getUserName() {
        return userName;
    }

    /** 
     * 设置 t_user.user_name
     * @param userName t_user.user_name
     */
    public final void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * 获取 t_user.password
     * @return t_user.password
     */
    public final String getPassword() {
        return password;
    }

    /** 
     * 设置 t_user.password
     * @param password t_user.password
     */
    public final void setPassword(String password) {
        this.password = password;
    }

    /** 
     * 获取 t_user.phone
     * @return t_user.phone
     */
    public final String getPhone() {
        return phone;
    }

    /** 
     * 设置 t_user.phone
     * @param phone t_user.phone
     */
    public final void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append("]");
        return sb.toString();
    }
}