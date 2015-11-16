package com.xiaoka.mybatis;

import com.xiaoka.mybatis.dao.CarUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/5/30.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private CarUserMapper carUserMapper;
    @Override
    public CarUser getUserById(int userId) {
        return carUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<CarUser> getUsers() {
        return carUserMapper.getUsers();
    }

}
