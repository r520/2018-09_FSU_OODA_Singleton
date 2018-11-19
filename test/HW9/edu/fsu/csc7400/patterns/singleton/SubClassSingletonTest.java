package HW9.edu.fsu.csc7400.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * BaseSingletonTest will do a basic test of the base singleton
 * 
 * @author orlando
 * Student: Radhika Kasu
 */
class SubClassSingletonTest {
	
	private SubClassSingleton singleton;

	@BeforeEach
	void setUp() throws Exception {
		singleton = SubClassSingleton.getInstance();
	}

	@Test
	void testGetInstance() {
		assertEquals(
				0,
				SubClassSingleton.getInstance().getSomeState());
	}

	@Test
	void testSetSomeState() {
		singleton.setSomeState(3);
		assertEquals(
				3,
				singleton.getSomeState());
	}

	@Test
	void testGetSomeState() {
		singleton.setSomeState(-1);
		assertEquals(
				-1,
				singleton.getSomeState());
	}


	/**This test case is expected to fail.
    Here the doSomething() method is setting the value to basesingleton someState variable.
    So when we get the value variable, it returns variable someState of subClassSingleton.
    Both do not match */
    @Test
	void testDoSomething() {
		singleton.doSomething();
		assertEquals(
				2,
				singleton.getSomeState());
	}

	@Test
	void testNewFunction() {
		assertEquals(
				100,
				singleton.newFunction());
	}

}
