package com.n1belungen.service;

import com.n1belungen.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {
    /**
     * 验证管理员登录
     * @param user_name
     * @param user_pwd
     * @return
     */
    List<Admin> judgeAdminLogin(@Param("user_name") String user_name , @Param("user_pwd") String user_pwd);
}

