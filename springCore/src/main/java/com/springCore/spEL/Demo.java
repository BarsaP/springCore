package com.springCore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
  @Value("#{10+20}")
  private int x;
  @Value("#{2+24+50}")
  private int y;
  
  //static method
  
  @Value("#{T(java.lang.Math).sqrt(144)}")
  private int z;
  
  //static variable
  @Value("#{T(java.lang.Math).PI}")
  private double e;
  
  //using object
  @Value("#{new java.lang.String('Barsa Jena')}")
  private String name;
  
  //boolean type value
  @Value("#{8 > 3}")
  private boolean isActive;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
}
}
