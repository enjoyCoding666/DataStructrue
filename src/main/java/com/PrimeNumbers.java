package com;

import java.util.ArrayList;
import java.util.List;
/*定义d​n​​为：d​n​​=p​n+1​​−p​n​​，其中p​i​​是第i个素数。显然有d​1​​=1，且对于n>1有d​n​​是偶数。
“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
现给定任意正整数N(<10​5​​)，请计算不超过N的满足猜想的素数对的个数。*/

public class PrimeNumbers {
    public void countNumbers(int N){
        List<Integer> list=new ArrayList<Integer>();
        int number=0;
        System.out.println(N+"范围内的素数为:");
        for(int i=0;i<N;i++){
            if(isPrime(i)) {
                list.add(i);
                System.out.print(i+"  ");
            }
        }
        System.out.println();
        for(int i=1;i<list.size();i++) {
            if(list.get(i)-list.get(i-1)==2) {
                number++;
            }
        }
        System.out.println("满足条件的素数对为:"+number);
    }

    public boolean isPrime(int number) {
        if(number<2) {
            return  false;
        } else if(number==2) {
            return true;
        }else {
            for(int i=number/2;i>1;i--) {
                if(number%i==0) {
                    return false;
                }
            }
            return true;
        }

    }
}
