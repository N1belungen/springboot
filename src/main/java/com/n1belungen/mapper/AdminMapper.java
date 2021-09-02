package com.n1belungen.mapper;

import com.n1belungen.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//管理员操作
@Mapper
@Repository
public interface AdminMapper {

    /**
     * 验证管理员登录
     * @param user_name
     * @param user_pwd
     * @return
     */
    List<Admin> judgeAdminLogin(@Param("user_name") String user_name , @Param("user_pwd") String user_pwd);
}
