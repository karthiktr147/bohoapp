package com.mindtree.bohoapp.entity;

import java.sql.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long userId;
private String userName;
@Temporal(TemporalType.TIMESTAMP)
@OneToMany(mappedBy = "user", cascade = CascadeType.ALL,targetEntity = Room.class)
@MapKeyClass(value = Room.class)
private Map<Room,Date> status;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(long userId, String userName, Map<Room, Date> status) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.status = status;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Map<Room, Date> getStatus() {
	return status;
}
public void setStatus(Map<Room, Date> status) {
	this.status = status;
}
public User(String userName, Map<Room, Date> status) {
	super();
	this.userName = userName;
	this.status = status;
}

}
