package test.com; 

import com.OrderNumbers;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* OrderNumbers Tester. 
* 
* @author <Authors name> 
* @since <pre> 12, 2017</pre>
* @version 1.0 
*/ 
public class OrderNumbersTest { 
  OrderNumbers orderNumbers=new OrderNumbers();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: printOrderNumbers(int number) 
* 
*/ 
@Test
public void testPrintOrderNumbers() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: swap(int number1, int number2) 
* 
*/ 
@Test
public void testSwap() throws Exception { 
//TODO: Test goes here...
    orderNumbers.swap(1,2);
} 

/** 
* 
* Method: swapString(String str1, String str2) 
* 
*/ 
@Test
public void testSwapString() throws Exception { 
//TODO: Test goes here... 
} 


} 
