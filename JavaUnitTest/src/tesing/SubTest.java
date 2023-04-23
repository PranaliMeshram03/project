package tesing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubTest {
	@Test
	
	public void subTest() {
		 MyJunitClass  junit = new  MyJunitClass ();
		 int result = junit.add(100, 200);
		 assertEquals(100,result);
	}
}
