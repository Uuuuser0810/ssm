package com.jiyx.dao;

public interface Role_permissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role_permissions record);

    int insertSelective(Role_permissions record);

    Role_permissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role_permissions record);

    int updateByPrimaryKey(Role_permissions record);
}