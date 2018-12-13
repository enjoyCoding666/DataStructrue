package find; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BinaryFind Tester. 
* 
* @author <Authors name> 
* @since <pre>12/12/2018</pre> 
* @version 1.0 
*/ 
public class BinaryFindTest { 
    private  BinaryFind binaryFind=new BinaryFind();
    private int[] sortedArray=new int[]{1,2,3,4,5,6};
    private int[] sortedArray2=new int[]{1,2,3,4,5,6,7};
    private int number=2;

    @Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: find(int[] sortedArray, int number) 
* 
*/ 
@Test
public void testFind() throws Exception { 
//TODO: Test goes here...
        int index=  binaryFind.find(sortedArray2,number);

        Assert.assertEquals(1,index);
}


} 
