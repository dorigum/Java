package ch18.sec05;

import java.io.Serializable;

public class Student implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	// private static final long
	private String id;
	private String name;
	private String major;
	private String tel;
	private String address;
	
	public Student(String id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
