package test.stack; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import stack.StackDemo;

import java.util.Stack;

/** 
* StackDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>26, 2017</pre>
* @version 1.0 
*/ 
public class StackDemoTest { 
  StackDemo stackDemo=new StackDemo();
  int[] array={1,2,3,4,5};
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: reverseOrder(int[] array) 
* 
*/ 
@Test
public void testReverseOrder() throws Exception { 
//TODO: Test goes here...
    Stack stack=stackDemo.reverseOrder(array);
    stackDemo.listStack(stack);
} 

/** 
* 
* Method: listStack(Stack<Integer> stack) 
* 
*/ 
@Test
public void testListStack() throws Exception { 
//TODO: Test goes here... 
} 


} 
