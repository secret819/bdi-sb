package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.util.Calc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdiSbApplicationTests {

	@Autowired
	private Calc calc;
	
	@Test
	public void contextLoads() {
		assertNotNull(calc);
	}
	
	@Test
	public void addTest() {

		int result = calc.add(4, 4);
		assertEquals(8, result);
	}
	
	@Test
	public void subtractionTest() {
		int result = calc.subtraction(4, 4);
		assertEquals(0,result);
	}
	
	@Test
	public void Multiplication() {
		int result = calc.Multiplication(4, 4);
		assertEquals(16,result);
	}
	
	@Test
	public void Division() {
		int result = calc.Division(4, 4);
		assertEquals(1,result);
	}

}
