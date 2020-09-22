package com.exercicio2.test;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.exercicio2.Invoice;


public class InvoiceTest {
	Invoice tenis ;
	@Before
	public void setUp() throws Exception {
		tenis = new Invoice(1, "Descricao", 1,-100.00 );
	}

	@Test
	public void testGetInvoiceAmount() {
		assertEquals(0.00 , tenis.getInvoiceAmount());
	}
//
//	@Test
//	public void testGetQuantidade() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetQuantidade() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPreco() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetPreco() {
//		fail("Not yet implemented");
//	}

}
