package com.jiyx.entity;

public class Permissions {
    private long id;
    /**
     * 权限
     */
    private String permissions;
    /**
     * 描述
     */
    private String description;

    public Permissions(long id, String permissions, String description) {
        this.id = id;
        this.permissions = permissions;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", permissions='" + permissions + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
