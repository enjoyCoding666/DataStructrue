package test.linkList; 

import linkList.LinkListExample;
import linkList.LinkListOperation;
import linkList.Node;
import linkList.NodeExample;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LinkListExample Tester. 
* 
* @author <Authors name> 
* @since <pre> 1, 2017</pre>
* @version 1.0 
*/ 
public class LinkListExampleTest { 
    Node node0=new NodeExample().initial();
    LinkListExample linkListExample=new LinkListExample();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insertByOrder(Node node0, int number) 
* 
*/ 
@Test
public void testInsertByOrder() throws Exception { 
//TODO: Test goes here...
    Node node=linkListExample.insertByOrder(node0,0);
    new LinkListOperation().listNode(node);
} 


} 
