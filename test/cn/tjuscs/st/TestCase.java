/**
 * 
 */
package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import cn.tjuscs.st.Triangle;
/**
 * @author Yangmutong
 *
 */

@RunWith(Parameterized.class)
public class TestCase {
	private int a;
	private int b;
	private int c;
	private int expected;
	
	private Triangle triangle;
	
	public TestCase(int expected,int a, int b,int c)
	{
		this.expected = expected;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	
	@Parameters
	public static Collection<Object[]> getData()
	{
		return Arrays.asList(new Object[][]
				{
					{0,2,2,2},
					{0,5,5,5},
					{0,6,6,6},
					{1,5,2,5},
					{1,2,2,3},
					{1,8,7,7},
					{2,1,2,3},
					{2,5,6,1},
					{2,7,6,1},
					{-1,-2,-3,4},
					{-1,2,5,-8},
					{-1,5,6,7}
				});	
	}
	
	/**
	 * Test method for {@link cn.tjuscs.st.Triangle#getTriangleKind(int, int, int)}.
	 */
	
	@Test
	public void testGetTriangleKind() {

		assertEquals(this.expected, triangle.getTriangleKind(a, b, c));
	}

}
