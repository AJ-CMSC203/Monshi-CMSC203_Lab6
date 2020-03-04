import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GradeBookTest {

	@BeforeEach
	public void setUp() throws Exception {
		GradeBook book1 = new GradeBook(5);
		book1.addScore(85);
		book1.addScore(70);
	}

	

	@Test
	
	public void testSum() {
		assertEquals(155, book1.sum(), .0001);
		
	}
	
	public void testMinimum() {
		assertEquals(70, book1.minimum(), .001 ); 
	}
	
	public void testFinalScore() {
		asserEquals(85, book1.finalScore, .0001);
	}
	
	
	
	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		
	}

}
