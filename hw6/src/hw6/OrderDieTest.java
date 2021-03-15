package hw6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderDieTest {

	@Test
	void testOrderDie(){
		OrderDie test1 = new OrderDie("description", "color");
		DiceBag db = new DiceBag();
		db.addToken(test1);
		Token actual = db.drawToken();
		Token expected = test1;
		assertEquals(expected, actual);
	}
	@Test
	void testToString(){
		OrderDie test2 = new OrderDie("description", "color");
		DiceBag db = new DiceBag();
		db.addToken(test2);
		String actual = db.toString();
		String expected = " Dice left: 1\ndescription\n";
		assertEquals(expected, actual);
	}
	@Test
	void testFiveOrderDie(){
		DiceBag db = new DiceBag();
		OrderDie test1 = new OrderDie("Die 1", "blue");
		OrderDie test2 = new OrderDie("Die 2", "blue");
		OrderDie test3 = new OrderDie("Die 3", "blue");
		OrderDie test4 = new OrderDie("Die 4", "red");
		OrderDie test5 = new OrderDie("Die 5", "red");
		
		db.addToken(test1);
		db.addToken(test2);
		db.addToken(test3);
		db.addToken(test4);
		db.addToken(test5);
		
		
		String actual = db.toString();
		String expected = " Dice left: 5\nDie 1\nDie 2\nDie 3\nDie 4\nDie 5\n";
		assertEquals(expected, actual);
	}
}