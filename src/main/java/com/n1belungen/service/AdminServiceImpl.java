package com.n1belungen.service;

import com.n1belungen.entity.Admin;
import com.n1belungen.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    //Service层 调用 Mapper层
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public List<Admin> judgeAdminLogin(String user_name, String user_pwd) {
        return adminMapper.judgeAdminLogin(user_name, user_pwd);
    }
}
