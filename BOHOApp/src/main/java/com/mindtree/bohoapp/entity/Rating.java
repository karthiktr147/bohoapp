package com.mindtree.bohoapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ratingId;
	private long facilityId;
	private long roomId;
	private long userId;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(long ratingId, long facilityId, long roomId, long userId) {
		super();
		this.ratingId = ratingId;
		this.facilityId = facilityId;
		this.roomId = roomId;
		this.userId = userId;
	}
	public long getRatingId() {
		return ratingId;
	}
	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}
	public long getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(long facilityId) {
		this.facilityId = facilityId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	

}
