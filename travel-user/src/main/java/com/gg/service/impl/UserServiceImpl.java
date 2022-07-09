package com.gg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gg.domain.User;
import com.gg.service.UserService;
import com.gg.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author LZG
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-08 17:09:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




