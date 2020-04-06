package com.mindtree.bohoapp.service.impl;

import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohoapp.entity.Room;
import com.mindtree.bohoapp.entity.User;
import com.mindtree.bohoapp.exception.service.BOHOAppServiceException;
import com.mindtree.bohoapp.exception.service.NoSuchRoomException;
import com.mindtree.bohoapp.repository.IRoomRepository;
import com.mindtree.bohoapp.repository.IUserRepository;
import com.mindtree.bohoapp.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
@Autowired
private IRoomRepository roomRepository;
@Autowired
private IUserRepository userRepository;
	@Override
	public String bookRoomByUserRegistration(User user, long roomId,Date date) throws BOHOAppServiceException {
		Room room =roomRepository.findById(roomId).orElseThrow(()->new NoSuchRoomException("there is no room with such room id please try again with correct roomId"));
		Map<Room,Date> map = new LinkedHashMap<Room, Date>();
		map.put(room, date);
		userRepository.save(user);
		return null;
	}

}
