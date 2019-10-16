package com.gpw.bean;

/**
 * @Author: Gpw
 * @Date: 2019/5/22
 * @Description: com.gpw.bean
 * @Version: 1.0
 */
public class Employee {
    private String id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
