/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectproject;

import java.util.Iterator;

public class ArrayIterator implements Iterator {    	
	private int current;    
	private Object[] items;    

	public ArrayIterator(Object[] items) {        
		this.current = 0;        
		this.items = items;    
	}    

	public boolean hasNext() {  
            
		return (items[current]!=null && current < items.length);    
	}    

	public  Object next() {        
		return items[current++];    
	}    

	public void remove() {        
		throw new UnsupportedOperationException();    
	}        

}