package org.nix.dao.repositories;

import org.nix.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by zhangpe0312@qq.com on 2018/4/8.
 *
 * TODO: 系统用户底层业务接口
 */
@Transactional(rollbackFor = Exception.class)
public interface SysUserJpa extends JpaRepository<SysUser,Integer> {

    @Query(nativeQuery = true,
    value = "SELECT * FROM sys_user WHERE account = ?1 AND `password` = ?2")
    SysUser findSysUserByAccountAndPassword(String account , String password);



}