package com.mindtree.bohoapp.service;

import java.sql.Date;

import com.mindtree.bohoapp.entity.User;
import com.mindtree.bohoapp.exception.service.BOHOAppServiceException;

public interface IUserService {
public String bookRoomByUserRegistration(User user,long roomId,Date date) throws BOHOAppServiceException;
}
