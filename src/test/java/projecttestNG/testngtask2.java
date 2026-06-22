package projecttestNG;

import org.testng.annotations.Test;

public class testngtask2 {

	public class testngtask21 {
		int a=20;
		int b=30;
	
		@Test
		public void addictiction() {
			int sum=a+b;
			System.out.println(sum);
			
		}
		
	// TODO Auto-generated method stub
		@Test
public void substraraction() {
	int sub=a-b;
	System.out.print(sub);
}
		@Test
		public void multiplication() {
			int mul=a*b;
			System.out.println(mul);
		}
		@Test
		public void division() {
			int div=a/b;
			System.out.println(div);
		}
	}

}
