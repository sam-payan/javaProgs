class student{
	String firstName;
	String lastName;
	String department;
	int age;
	float sub1,sub2,sub3;
	
	public static int studentCount = 0;	
	public student(){
		firstName = "sumit";
		lastName = "payan";
		department = "DOCS";
		age = 18;
		sub1 = 55;
		sub2 = 56;
		sub3 = 57;
		studentCount++;
	}

	public student(String fName, String lName, String dept, int a, float s1, float s2, float s3){
		firstName = fName;
		lastName = lName;
		department = dept;
		age = a;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		studentCount++;
		
		/*
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
		System.out.println("Marks of sub1 is: "+ sub1);
		System.out.println("Marks of sub2 is: "+ sub2);
		System.out.println("Marks of sub3 is: "+ sub3);
		System.out.println("Averege of marks: "+ calculateAvg());
		System.out.println("Grade of marks: "+ getGrade());
		System.out.println("Students count is: "+ studentCount);
		System.out.println();		
		*/
	}

	//getter methods
	public String getFirstName(){ return firstName;}
	public String getLastName(){ return lastName;}
	public String getDepartmentName(){ return department;}
	public int getAge(){ return age;}
	public float getSub1(){return sub1;}
	public float getSub2(){return sub2;}
	public float getSub3(){return sub3;}

	//setter methods
	public void setFirstName(String fName){
		firstName = fName;
	}

	public void setLastName(String lName){
		lastName = lName;
	}

	public void setDepartment(String dept){
		department = dept;
	}

	public void setAge(int a){
		age = a;
	}

	public void setSub1(float s1){
		sub1 = s1;
	}

	public void setSub2(float s2){
		sub2 = s2;
	}

	public void setSub3(float s3){
		sub3 = s3;
	}	
	
	public String toString(){
		String str = "Name: "+firstName+ " " +lastName +"\n";
		str += "Age: "+ age+"\n";
		str += "Department: " + department+ "\n";
		str += "Marks of sub1 is: "+ sub1+ "\n";
		str += "Marks of sub2 is: "+ sub2+ "\n";
		str += "Marks of sub3 is: "+ sub3+ "\n";
		str += "Averege of marks: "+ calculateAvg()+ "\n";
		str += "Grade of marks: "+ getGrade()+ "\n";
		str += "Students count is: "+ studentCount+ " ";
		return str;
	}

	public void printInfo(){
		System.out.print(firstName+" "+lastName+"\t  ");
		System.out.print(age+"\t   ");
		System.out.print(department+"\t          ");
		System.out.print( sub1+"\t ");
		System.out.print( sub2+"\t ");
		System.out.print( sub3+"\t  ");
		System.out.print( calculateAvg()+"\t          ");
		System.out.print( getGrade()+"\t   ");
		System.out.print(studentCount+"\t");
	}

	public float calculateAvg(){
		float avg = (sub1 + sub2 + sub3)/ 3;
		return avg;
	}
	
	public String getGrade(){
		if (calculateAvg() >=90){
			return "A";
		}
	    else if (calculateAvg() >=80){
			return "B";
		}
		else if (calculateAvg() >=70){
			return "C";
		}
		else if (calculateAvg() >=60){
			return "D";
		}
		else if (calculateAvg() >=50){
			return "E";
		}
		else{
			return "FAIL";
		}	
	}
}

class testStudent{
	public static void main(String[] args){
		
		student std1 = new student();
		System.out.print("    Name\t  Age\t Department\t  Sub1\t Sub2\t Sub3\t Average\tGarde\t Count\n");
		System.out.println("------------------------------------------------------------------------------------------------");
		std1.printInfo();
		
		//System.out.println(std1);
		System.out.println();
	
		student std2 = new student("Dinesh","Devariya","DOCS",19, 49, 48, 47);
		std2.printInfo();
		
		student std3 = new student();
		
		student[] stds = new student[3];
		stds[0] = std1;
		stds[1] = std2;
		stds[2] = std3;
			stds[2].setFirstName("saaD");
			stds[2].setLastName("khatri");
			stds[2].setAge(20);
			stds[2].setDepartment("DOCS");
			stds[2].setSub1(63);
			stds[2].setSub2(67);
			stds[2].setSub3(53);
		System.out.println("");
		std3.printInfo();
		
		System.out.println("");
		for(int i = 0; i <= stds.length; i++){
			stds[i].printInfo();
			System.out.println();
		}
	}
}
