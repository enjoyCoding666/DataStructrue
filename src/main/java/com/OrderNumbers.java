package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/10/10.
 */
public class OrderNumbers {
    public static void main(String[] args) {

    }

    /**
     * 递归处理，但是没有处理number<=0的情况，不够健壮
     * 当数量级太大，比如输入100000时，会导致栈溢出.
     * @param number
     */
    public  void printOrderNumbers(int number){
        if(number>0){
            printOrderNumbers(number-1);
            System.out.print(number+" ");
        }
    }

    /**
     *  交换字符串，理解 java是值传递的，而非引用传递。
     *  调用该函数并不能实现交换实参，只能交换形参
     * @param str1
     * @param str2
     */

    public void  swapString(String str1,String str2) {

         String temp=str1;
         str1=str2;
         str2=temp;

//        List<String> list=new ArrayList<String>();
//        list.add(str1);
//        list.add(str2);
//        Collections.swap(list,0,1);
    }

}
