/**
 * Created by Administrator on 2017/10/10.
 */
public class OrderNumbers {
    public static void main(String[] args) {

    }

    //递归处理，但是没有处理number<=0的情况，不够健壮
    //当数量级太大，比如输入100000时，会导致栈溢出.
    public  void printOrderNumbers(int number){
        if(number>0){
            printOrderNumbers(number-1);
            System.out.print(number+" ");
        }
    }

}
