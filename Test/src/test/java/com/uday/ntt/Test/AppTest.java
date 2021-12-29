package com.uday.ntt.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void addition() {
    	App ref=new App();
    	int RequiredOP=ref.add(10,20);
    	int exceptedOP=30;
    	assertEquals(exceptedOP,RequiredOP);
}
	@Test
	public void additioOfNegativen() {
    	App ref=new App();
    	int RequiredOP=ref.add(-10,-20);
    	int exceptedOP=-1;
    	assertEquals(exceptedOP,RequiredOP);
	}
	@Test
	public void additioOfZeros() {
    	App ref=new App();
    	int RequiredOP=ref.add(0,-20);
    	int exceptedOP=-1;
    	assertEquals(exceptedOP,RequiredOP);
	}
}