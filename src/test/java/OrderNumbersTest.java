

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* OrderNumbers Tester. 
* 
* @author <Authors name> 
* @since <pre> 10, 2017</pre>
* @version 1.0 
*/ 
public class OrderNumbersTest { 
  private  OrderNumbers orderNumbers=new OrderNumbers();

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
    orderNumbers.printOrderNumbers(100000);
} 


} 
