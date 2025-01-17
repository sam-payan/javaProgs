class student{
	String firstName;
	String lastName;
	String department;
	int age;
	
	public student(){
		firstName = "sumit";
		lastName = "payan";
		department = "DOCS";
		age = 18;
	}

	public student(String fName, String lName, String dept, int a){
		firstName = fName;
		lastName = lName;
		department = dept;
		age = a;
	}

	//getter methods
	public String getFirstName(){ return firstName;}
	public String getLastName(){ return lastName;}
	public String getDepartmentName(){ return department;}
	public int getAge(){ return age;}

	//setter methods
	public void setFirstName(String fName){
		firstName = fName;
	}

	public void setlastName(String lName){
		lastName = lName;
	}

	public void setDepartment(String dept){
		department = dept;
	}

	public void setAge(int a){
		age = a;
	}
	
	public void printInfo(){
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
	}
	
	public String toString(){
		String str = "Name: "+firstName+ " " +lastName +"\n";
		str += "Age: "+ age+"\n";
		str += "Department: " + department;
		
		return str;
	}
}

class testStudent{
	public static void main(String[] args){
		student std1 = new student();
		student std2 = new student("Dinesh","Devariya","DOCS",19);
		
		//std1.printInfo();
		System.out.println(std1);
		System.out.println();
		System.out.println(std2);
		//std2.printInfo();
	}
}