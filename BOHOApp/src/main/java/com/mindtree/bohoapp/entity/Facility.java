package com.mindtree.bohoapp.entity;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Table(name = "facility")
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "facilityId")
public class Facility {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long facilityId;
private String facilityName;
private String place;
@OneToMany(mappedBy = "facility", cascade = CascadeType.ALL,targetEntity = Room.class)
@MapKeyClass(value = Room.class)
private Map<Room,String> rooms;
public Facility() {
	super();
	// TODO Auto-generated constructor stub
}
public Facility(long facilityId, String facilityName, String place, Map<Room, String> rooms) {
	super();
	this.facilityId = facilityId;
	this.facilityName = facilityName;
	this.place = place;
	this.rooms = rooms;
}
public long getFacilityId() {
	return facilityId;
}
public void setFacilityId(long facilityId) {
	this.facilityId = facilityId;
}
public String getFacilityName() {
	return facilityName;
}
public void setFacilityName(String facilityName) {
	this.facilityName = facilityName;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public Map<Room, String> getRooms() {
	return rooms;
}
public void setRooms(Map<Room, String> rooms) {
	this.rooms = rooms;
}

}
