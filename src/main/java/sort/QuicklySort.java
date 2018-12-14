package sort;

/**
 * 快速排序.
 * https://gitbook.cn/books/59f6a752d97c2122653a169e/index.html
 */
public class QuicklySort {

    /**
     *
     * @param a 数组
     * @param low  数组开始的下标。也就是0。
     * @param high  数组末尾的下标。也就是length-1。
     */
    public int[] sort(int a[],int low,int high){
        if(low>high || a==null) {
            return null;
        }

        int i=low;
        int j=high;
        //key设置为数组首位
        int key=a[low];

        //while结束后，小于key的全部放在key的左边，大于key的全部放在右边。。
         while (i<j) {
               //最后面的下标，从后向前遍历，找到第一个大于key的数据，将它赋给数组首位
                while (i<j && key<=a[j]) {
                     j--;
                }
                a[i]=a[j];
                //最前面的下标，从前向后遍历，找到第一个小于key的数据
                while (i<j && key>=a[i]) {
                    i++;
                }
                a[j]=a[i];
                a[i]=key;
            }
        //以下的i就是key的下标，对key两边的数据分别进行排序。
           sort(a,low,i-1);
           sort(a,i+1,high);


        return  a;

    }



}
