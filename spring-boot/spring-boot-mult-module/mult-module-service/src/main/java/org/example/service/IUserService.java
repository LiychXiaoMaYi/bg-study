package org.example.service;

import org.example.dao.entity.User;

/**
 * Created by hzzhujiajun on 2017/7/5.
 */
public interface IUserService {

    boolean addUser(User user) throws NullPointerException, IllegalArgumentException;

    User findByName(String name);

}
