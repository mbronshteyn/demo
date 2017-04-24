package com.mbronshteyn.dao;

import com.mbronshteyn.dao.model.User;

import javax.annotation.Resource;

/**
 * Created by mbronshteyn on 4/21/17.
 */
@Resource
public interface UserDAO {

    public void createUser( User user );
    public void deleteUser( String userId );
    public void updateUser( User user );
    public User lookupUser( String userId );

}
