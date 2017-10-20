package test.linkList; 

import linkList.LinkListOperation;
import linkList.Node;
import linkList.NodeExample;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LinkListOperation Tester. 
* 
* @author <Authors name> 
* @since <pre> 20, 2017</pre>
* @version 1.0 
*/ 
public class LinkListOperationTest {
    NodeExample nodeExample=new NodeExample();
    LinkListOperation linkListOperation=new LinkListOperation();
    Node node0= nodeExample.initial();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findNode(Object element, Node node) 
* 
*/ 
@Test
public void testFindNode() throws Exception { 
//TODO: Test goes here...
    System.out.println("查找元素10：");
   linkListOperation.findNode(10,node0);
    System.out.println("查找另一个元素4:");
   linkListOperation.findNode(4,node0);
} 

/** 
* 
* Method: insertNode() 
* 
*/ 
@Test
public void testInsertNode() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateNode() 
* 
*/ 
@Test
public void testUpdateNode() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: removeNode() 
* 
*/ 
@Test
public void testRemoveNode() throws Exception { 
//TODO: Test goes here...
    Node node1=node0.getNext();
    Node node2=node1.getNext();
    System.out.println("初次遍历如下：");
    linkListOperation.listNode(node0);
    linkListOperation.removeNode(node0,node0);
    System.out.println("移除元素后再次遍历如下：");
    linkListOperation.listNode(node0);
} 

@Test
public  void testListNode() throws Exception{
    linkListOperation.listNode( node0 );
}
} 
