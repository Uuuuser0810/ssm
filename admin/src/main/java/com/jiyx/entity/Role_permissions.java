package com.jiyx.entity;

public class Role_permissions {
    private long id;
    private long r_id;
    private long p_id;

    public Role_permissions(long id, long r_id, long p_id) {
        this.id = id;
        this.r_id = r_id;
        this.p_id = p_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getR_id() {
        return r_id;
    }

    public void setR_id(long r_id) {
        this.r_id = r_id;
    }

    public long getP_id() {
        return p_id;
    }

    public void setP_id(long p_id) {
        this.p_id = p_id;
    }

    @Override
    public String toString() {
        return "Role_permissions{" +
                "id=" + id +
                ", r_id=" + r_id +
                ", p_id=" + p_id +
                '}';
    }
}
