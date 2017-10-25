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
    Node nodeOnlyOne=nodeExample.initialOneNode();

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
    Node node1=node0.getNext();
    Node node2=node1.getNext();
    Node node3=node2.getNext();
    Node nodeInsert=new Node(10,null);
    Node node=linkListOperation.insertNode(node0,node3,nodeInsert);
    linkListOperation.listNode(node);
} 

/** 
* 
* Method: updateNode() 
* 
*/ 
@Test
public void testUpdateNode() throws Exception { 
//TODO: Test goes here...
    Node node1=node0.getNext();
    Node node2=node1.getNext();
    Node node3=node2.getNext();
    Node nodeUpdate=new Node(20,null);
    Node node=linkListOperation.updateNode(node0,node2,nodeUpdate);
    linkListOperation.listNode(node);
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
    Node node3=node2.getNext();

    System.out.println("初次遍历如下：");
    linkListOperation.listNode(node0);
    node0=linkListOperation.removeNode(node3,node0);
    System.out.println("移除元素后再次遍历如下：");
    linkListOperation.listNode(node0);

} 

@Test
public  void testListNode() throws Exception{
    linkListOperation.listNode( node0 );
}

@Test
public void testFindKthNode() throws Exception{
    Node node=linkListOperation.findKthNode(node0,4);
    System.out.println(node.getElement());
 }
} 
