package fr.sg.katasgcib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for KataSGCIB
 * 
 * @author Fabien Davaut
 */
public class KataSGCIBTest {

	@Test
	public void testMain() {

		// Just to see the result
		KataSGCIB.main(new String[] {});
	}

	@Test
	public void testFirstStatements() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","1",myKataSGCIB.execute(1));
		
		assertEquals("Bad expected result: ","2",myKataSGCIB.execute(2));
		
		assertEquals("Bad expected result: ","FooFoo",myKataSGCIB.execute(3));
		
		assertEquals("Bad expected result: ","4",myKataSGCIB.execute(4));
		
		assertEquals("Bad expected result: ","BarBar",myKataSGCIB.execute(5));
		
		assertEquals("Bad expected result: ","Foo",myKataSGCIB.execute(6));
		
		assertEquals("Bad expected result: ","QixQix",myKataSGCIB.execute(7));
		
		assertEquals("Bad expected result: ","8",myKataSGCIB.execute(8));
		
		assertEquals("Bad expected result: ","Foo",myKataSGCIB.execute(9));
		
		assertEquals("Bad expected result: ","Bar",myKataSGCIB.execute(10));
		
	}

	@Test
	public void test51Statement() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","FooBar",myKataSGCIB.execute(51));
	}

	@Test
	public void test53Statement() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","BarFoo",myKataSGCIB.execute(53));
	}

	@Test
	public void test21Statement() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","FooQix",myKataSGCIB.execute(21));
	}

	@Test
	public void test13Statement() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","Foo",myKataSGCIB.execute(13));
	}

	@Test
	public void test15Statement() {

		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","FooBarBar",myKataSGCIB.execute(15));
	}

	@Test
	public void test33Statement() {
		
		KataSGCIB myKataSGCIB = new KataSGCIB();
		assertEquals("Bad expected result: ","FooFooFoo",myKataSGCIB.execute(33));
	}
	
}
