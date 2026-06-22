package projecttestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNGtask1 {
	@Test
	

	public void class1() {
		System.out.println("Hello world");
		// TODO Auto-generated method stub

	}
	@BeforeTest
	public void class2() {
		System.out.println("Mello world");
	}
	@AfterTest
	public void class3() {
		System.out.println("hello world");
		
	}

}
