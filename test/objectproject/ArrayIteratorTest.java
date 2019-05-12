/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectproject;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class ArrayIteratorTest {
	
	@Test
	public final void testHasNext_BaseCase() throws ConcurrentModificationException 
	{
		List s = new ArrayList();
		s.add(new Square("(4,4)",3));
		s.add(new Rectangle("(6,8)",4,5));
		Iterator itr = s.iterator();
		assertTrue(itr.hasNext()); 
	}//TestHasNext_BaseCase
	
	public final void testHasNext_C1() throws ConcurrentModificationException
	{
		List s = new ArrayList();
		Iterator itr = s.iterator();
		assertFalse(itr.hasNext()); 
	}
	
        
	@Test(expected=NoSuchElementException.class)
	public void testNext_C1() throws ConcurrentModificationException 
	{
		List s = new ArrayList();
		Iterator itr = s.iterator();
		assertFalse(itr.hasNext());
		itr.next();
	}
        
	@Test
	public final void testNext_C2() throws ConcurrentModificationException 
	{
		List s = new ArrayList();
		s.add(null);
		Iterator itr = s.iterator();
		assertTrue(itr.hasNext()); 
		assertNull(itr.next());
	}
        
	@Test(expected=ConcurrentModificationException.class)
	public final void testNext_C5()  
	{
		List s = new ArrayList();
		s.add(new Rectangle("(3,4)",2,5));
		Iterator itr = s.iterator();
		assertTrue(itr.hasNext());
		s.add(new Square("(3,3)",7));
		itr.next();		
	}
        
	@Test
	public void ShouldBeWhenTheHasNextIsNotNull()	
	{
		List s = new ArrayList();
		s.add(new Circle("(2,3)",4));
		Iterator itr = s.iterator();
		assertNotNull(itr.hasNext()); 
	
	}
        
        @Test
	public void ShouldBeWhenTheHasNextIsTrue()	
	{
		List s = new ArrayList();
		s.add(new Circle("(2,3)",4));
		Iterator itr = s.iterator();
		assertTrue(itr.hasNext()); 
	
	}
        
	@Test
	public final void testRemove_C1() throws UnsupportedOperationException, 
	IllegalStateException, ConcurrentModificationException, NoSuchElementException 
	{
		Boolean nextState = false;
		
		List s = new ArrayList();
		s.add(null);
		Iterator itr = s.iterator();
		assertNull(itr.next());
		assertFalse(itr.hasNext());
		
		try {
            itr.next();	
        } catch (NoSuchElementException expected) {
        	nextState = true;
        }
        assertTrue(nextState);	//verify that next() resulted in a NSEE
		
		itr.remove();
	}
        
	@Test
	public final void testRemove_C3()
	{
		List t = new ArrayList();
		t.add(new Square("(2,2)",4));
		Iterator itr = t.iterator();
		assertEquals(Square.class, itr.next().getClass());
	}
	@Test
	public final void testRemove_C4()	
	{
		List s = new ArrayList();
		Iterator itr=s.iterator();
                while(itr.hasNext()){
                    assertNull(itr.next());
                }
                
	}//testRemove_C4
		

	@Test
	public void testRemove_C5()  
	{
		List s = new ArrayList();
		s.add(new Circle("(1,6)",5));
		s.add(new Square("(6,6)",5));
		Iterator itr = s.iterator();
                while(itr.hasNext()){
                    assertNotNull(itr.next());
                }
                
                
	}//testRemove_C5

}
