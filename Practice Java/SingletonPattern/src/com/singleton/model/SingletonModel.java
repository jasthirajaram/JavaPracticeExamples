package com.singleton.model;

public class SingletonModel {
	
	//step 1: create static object of the class
	private static SingletonModel singletonModel = new SingletonModel();

	//make the constructor as private
	private SingletonModel() {
		super();
	}
	
	//create one static method which returns the class object
    public static SingletonModel getInstance() {
    	return singletonModel;
    }
}
