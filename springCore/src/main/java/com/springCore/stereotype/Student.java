package com.springCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;
@Component("ob")
//@Component()
public class Student {
	@Value("Barsa")
   private String name;
	@Value("Jajpur")
private String city;

@Value("#{temp}")	
private List<String> address;
	
public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
}
   
}
