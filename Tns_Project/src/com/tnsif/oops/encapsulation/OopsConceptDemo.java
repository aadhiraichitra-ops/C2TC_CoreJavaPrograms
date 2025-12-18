package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
	 
		// TODO Auto-generated method stub
	  private int serialNum;  //declaration data members
      private String Name;
      private int Age;
      
      //getters and setters method
      
	  public int getSerialNum() { //is used to get an value
		  return serialNum; 
	  }
	  public void setSerialNum(int serialNum) {
		  this.serialNum = serialNum;    //used to refer the current object
	  }
	  public String getName() {
		  return Name;
	  }
	  public void setName(String name) {
		  Name = name;
	  }
	  public int getAge() {
		  return Age;
	  }
	  public void setAge(int age) {
		  Age = age;
	  }
      
     @override
     public String toString() {
    	 return"OopsConceptDemo [serialNum="+serialNum+","+"name="+Name+",age="+Age+"]";
     }

}
