package stack;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by lenovo on  十月
 * @author lin
 */
public class StackDemo {
    /**
     * 逆序存储
     * @param array
     * @return
     */
     public Stack reverseOrder(int[] array){
         Stack stack=new Stack();
         for(int k:array) {
             stack.push(k);
         }
         return  stack;
     }

    /**
     * 遍历栈
     * @param stack
     */
    public void listStack(Stack<Integer> stack){
        while ( ! stack.isEmpty()) {
            int i=stack.pop();
            System.out.println(i);
        }

    }

}
