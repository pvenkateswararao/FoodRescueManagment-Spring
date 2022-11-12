package com.trinadh.kiran.starter.FoodRescueManagement.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "social_worker")
public class SocialWorker{

	

	@Column(name = "name")
	@NotNull(message = "This field is required")
	String name;

	@Id
	@Column(name="mobile")
	String mobile;

	@Column(name = "password")
	@NotNull(message = "This field is required")
	String password;

	@Column(name = "email_id")
	@NotNull(message = "This field is required")
	String emailId;

	@Column(name = "address")
	@NotNull(message = "This field is required")
	String address;

	@Column(name = "state")
	@NotNull(message = "This field is required")
	String state;

	@Column(name = "city")
	@NotNull(message = "This field is required")
	String city;

	/*@OneToMany(targetEntity=Posts.class,cascade = CascadeType.ALL)
	@JoinColumn(name="sp_fk",referencedColumnName = "mobile")
	public List<Posts> posts;
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile")
	public List<Posts> posts;

	public SocialWorker() {
		
	}
	
	public SocialWorker(@NotNull(message = "This field is required") String name, String mobile,
			@NotNull(message = "This field is required") String password,
			@NotNull(message = "This field is required") String emailId,
			@NotNull(message = "This field is required") String address,
			@NotNull(message = "This field is required") String state,
			@NotNull(message = "This field is required") String city) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.password = password;
		this.emailId = emailId;
		this.address = address;
		this.state = state;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Posts> getPosts() {
		return posts;
	}

	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}
	

}
