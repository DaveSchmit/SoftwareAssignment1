package assignment1.assignment1;
import java.util.ArrayList;
import org.joda.time.*;

public class Course {
	private String cName;
	private ArrayList<module> modList =new ArrayList<module>();
	private LocalDate sDate;
	private LocalDate eDate;
	
	public Course(String cName,LocalDate sDate, LocalDate eDate){
		this.cName=cName;
		this.sDate=sDate;
		this.eDate=eDate;
		modList= new ArrayList<module>();
	}
	public String getName(String cName){
		return cName;
	}
	public LocalDate GetsDate(LocalDate sDate){
		return sDate;
	}
	public LocalDate GeteDate(LocalDate eDate){
		return eDate;
	}
	public void addModule(module m){
		modList.add(m);
	}
}
