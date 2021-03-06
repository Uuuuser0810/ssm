package com.jiyx.entity;

import java.io.Serializable;

public class Role implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 角色ID
     */
    private long id;
    /**
     * 角色名称
     */
    private String role;
    /**
     * 角色描述
     */
    private String description;

    public Role(long id, String role, String description) {
        this.id = id;
        this.role = role;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
