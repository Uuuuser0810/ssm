package com.jiyx.entity;

public class User_Role {
    private long id;
    /**
     * 用户ID
     */
    private long u_id;
    /**
     * 角色ID
     */
    private long r_id;

    public User_Role(long id, long u_id, long r_id) {
        this.id = id;
        this.u_id = u_id;
        this.r_id = r_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getU_id() {
        return u_id;
    }

    public void setU_id(long u_id) {
        this.u_id = u_id;
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    @Override
    public String toString() {
        return "User_Role{" +
                "id=" + id +
                ", u_id=" + u_id +
                ", r_id=" + r_id +
                '}';
    }
}
