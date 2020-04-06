package com.mindtree.bohoapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Table(name = "rooms")
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "roomId")
public class Room {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long roomId;
private double roomCost;
private String roomName;
@ManyToOne
private Facility facility;
@ManyToOne
private User user;
public Room() {
	super();
	// TODO Auto-generated constructor stub
}
public Room(long roomId, double roomCost, String roomName, Facility facility, User user) {
	super();
	this.roomId = roomId;
	this.roomCost = roomCost;
	this.roomName = roomName;
	this.facility = facility;
	this.user = user;
}
public long getRoomId() {
	return roomId;
}
public void setRoomId(long roomId) {
	this.roomId = roomId;
}
public double getRoomCost() {
	return roomCost;
}
public void setRoomCost(double roomCost) {
	this.roomCost = roomCost;
}
public String getRoomName() {
	return roomName;
}
public void setRoomName(String roomName) {
	this.roomName = roomName;
}
public Facility getFacility() {
	return facility;
}
public void setFacility(Facility facility) {
	this.facility = facility;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
