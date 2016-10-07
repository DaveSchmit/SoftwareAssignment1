package assignment1.assignment1;
import junit.framework.TestCase;
import junit.framework.Assert;
import org.joda.time.LocalDate;

public class StudentTest extends TestCase {
 
	public void test(){
		student s1= new student("James",24,new LocalDate("1994-07-12"));
		String name= "James24";
		Assert.assertTrue(s1.getID().equals(name));
	}
}
