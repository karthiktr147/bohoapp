package com.mindtree.bohoapp.controller;

import java.sql.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bohoapp.dto.ResponseBody;
import com.mindtree.bohoapp.entity.User;
import com.mindtree.bohoapp.exception.service.BOHOAppServiceException;
import com.mindtree.bohoapp.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private IUserService userService;
@Autowired
private ModelMapper modelMapper;
@PutMapping("/bookroom/{roomId}")
public ResponseEntity<?> bookRoomByUserRegistration(@RequestBody User user,@PathVariable long roomId,@RequestParam Date date) throws BOHOAppServiceException{
	return new ResponseEntity<ResponseBody<String>>(new ResponseBody<String>(
			userService.bookRoomByUserRegistration(modelMapper.map(user, User.class), roomId,date), null,
			"room booked successfully", true), HttpStatus.OK);
}


}
