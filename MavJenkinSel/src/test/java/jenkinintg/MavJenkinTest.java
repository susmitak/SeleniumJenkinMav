package jenkinintg;

import org.testng.annotations.Test;

	public class MavJenkinTest {

	@Test
	public void login() {
		
		System.out.println("Login into application");
			
	}
		@Test
		public void sum(){
		
			int a=10;
			int	b=20;
		
			System.out.println("The sum is =" + Integer.sum(a, b));
	
		
				
	}
	
}
