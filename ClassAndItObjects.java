package constructorS;

import org.junit.Test;

public class ClassAndItObjects {
	// signatur of class and object
	//modifier[opt] className objectname = new constructor();
	
	 @Test  
	public void creatingObjectForStudent(){
		student bike = new student();   // default constructor;
		System.out.println(bike.nmbrplate);
		System.out.println(bike.bikeColor);
		System.out.println(bike.milage);
		System.out.println(bike.name);
	}
     
	 @Test
	 public void CreatingObjectForMyStudent(){
		 MyStudent std1 = new MyStudent(1,"sai");
		 MyStudent std2 = new MyStudent(22,"ram");
		 MyStudent std3 = new MyStudent(33,"ramesh");
		 MyStudent std4 = new MyStudent(14,"ramu");
		 MyStudent std5 = new MyStudent(15,"shiva");
		 
		MyStudent[] std = {std1,std2,std3,std4,std5};   //creating my own array
		  for(int i=0;i<std.length;i++){
			  System.out.println(std[i].stdId);
			  System.out.println(std[i].stdName);
		  }
	 }
	 
	@Test
	public void CreatingObjectForMyLaptop(){
		laptop ltp1 = new laptop(121,"hp","black");
		laptop ltp2 = new laptop (122,"dell","blue");
		laptop ltp3 = new laptop(123,"lenovo","sliver");
		
		laptop[] lap = {ltp1,ltp2,ltp3};
		for(int i=0;i<lap.length;i++){
			
			System.out.println(lap[i].serialId);
			System.out.println(lap[i].laptopNme);
			System.out.println(lap[i].colorNme);

		//	System.out.println("find the object lap1"+"="+i+"="+lap);
		}
	}

}

class student{ 
	//iam creating object for student
	int nmbrplate=1234;
	String name="augusta";
	String bikeColor ="blue";
	int milage=17;
}


class MyStudent{
	int stdId;
	String stdName;
	public MyStudent(int id,String name){          //while creating constructor.same class name and constructor name should be same.
		                                            // there is no returntype "void".
		stdId = id;
		stdName = name;
	}	
	}

class laptop{
	int serialId;
	String laptopNme;
	String colorNme;
	public laptop(int id,String name,String name2){
		serialId = id;
		laptopNme = name;
		colorNme = name2;
	}
}


























