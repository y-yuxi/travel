package cn.yunhe.travel.service;

import cn.yunhe.travel.pojo.Permission;
import cn.yunhe.travel.pojo.Role;

import java.util.List;

public interface RoleService {
    /**
     * 查询所有角色信息
     */
    List<Role> findAllRoles();

    /**
     * 添加角色
     */
    void addRole(Role role);

    /**
     * 根据roleId查询要添加的资源权限
     * @param roleId
     */
    List<Permission> findOtherPermission(String roleId);

    /**
     * 给角色添加指定的资源权限
     */
    void addPermissionToRole(String roleId, String[] ids);
}
