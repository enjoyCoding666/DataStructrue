package find;

/**
 *   二分查找法：给定一组有序的数组，每次都从一半中查找。直到找到要求的数据。
 *   主要是得找到下标的表示方法。
 */
public class BinaryFind {

    /**
     * 使用二分法，找到有序数组中的某个数，返回下标。
     * @param sortedArray
     * @param number
     * @return
     */
    public int find(int[] sortedArray,int number){
          if(sortedArray==null)  {
              throw new IllegalArgumentException();
          }
          int size=sortedArray.length;
          int mid=size;
          boolean isNofound=true;
          //没找到对应的数据，就一直循环查找
          while (isNofound) {
              //根据数组长度为奇数/偶数，分情况先找到中间的元素
              if(size%2==1) {
                  mid=(size-1)/2;
              } else {
                  mid=size/2;
              }

              //如果中间的元素大于指定的数，就取左半边。
              if(sortedArray[mid]>number) {
                  mid=mid/2;
              }else if(sortedArray[mid]<number){
                  mid=mid/2*3;
              }else {
                  isNofound=false;
              }

          }
         return  mid;

    }



}
