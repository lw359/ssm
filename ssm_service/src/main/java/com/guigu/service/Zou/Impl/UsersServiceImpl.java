package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.UsersMapper;
import com.guigu.pojo.Users;
import com.guigu.service.Zou.Z_UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements Z_UsersService {
   }
