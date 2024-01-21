package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Israel Amit Uliel 319050423
 * Paz Abitbul 315663963
 */

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion1_Error() 
	{	
		Roots.calculate_roots(51, 2, 2);
		
		String root_expected = Root_Types.ERROR.toString();
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion2_TwoRoots() 
	{
		
		Roots.calculate_roots(4, 6, 2);
		
		String root_expected = Root_Types.Two_roots.toString();
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion3_EqualRoots() 
	{
		
		Roots.calculate_roots(1, 2, 1);
		
		String root_expected = Root_Types.Equal_roots.toString();	
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion4_NotQuadratic() 
	{	
		Roots.calculate_roots(0, 2, 1);
		
		String root_expected = Root_Types.Not_quadratic.toString();
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion5_NoRoots() 
	{	
		Roots.calculate_roots(2, 3, 4);
		
		String root_expected = Root_Types.No_roots.toString();
	
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
}
