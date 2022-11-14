import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressSoyMilk() {
		Beverage b1 = new Expresso();
		b1 = new Soy(b1);
		b1 = new StreamMilk(b1);
		assertEquals("Expresso, Soy, StreamMilk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}
	
	void testHouseBlendMocha() {
		Beverage b2 = new Decaf();
		b2 = new Whip(b2);
		b2 = new Soy(b2);
		assertEquals("Decaf, Whip, Soy",b2.getDescription());
		assertEquals(1.3,b2.cost());
	}

}
