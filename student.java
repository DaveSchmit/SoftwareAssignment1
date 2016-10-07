package assignment1.assignment1;
import org.joda.time.*;

public class student {
private int age;
private String Name;
private LocalDate DOB;
private String ID;

public student(String Name,int age,LocalDate DOB){
	this.Name=Name;
	this.age=age;
	this.DOB=DOB;
}
public String getName(){
	return Name;
}
public int getAge(){
	return age;
}
public LocalDate getDOB(){
	return DOB;
}
public String getID(){
	ID= Name + age;
	return ID;
}

}
