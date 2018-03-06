package com.freemarkerdemo.model;

import lombok.Data;

@Data
public class SysUser {
    private long id;
    private String name;
    private String phone;


    public SysUser() {
    }
    public SysUser(long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}