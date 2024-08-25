package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ketchup {
    private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Ketchup() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ketchup [weight=" + weight + "]";
	}
    
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}
