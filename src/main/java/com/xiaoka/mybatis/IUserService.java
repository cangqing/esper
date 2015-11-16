package com.xiaoka.mybatis;

import java.util.List;

/**
 * Created by Administrator on 2015/5/30.
 */
public interface IUserService {
    public CarUser getUserById(int userId);
    public List<CarUser> getUsers();
}
