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
          int last=sortedArray.length-1;
          int start=0;

          //没找到对应的数据，就一直循环查找
          while ( start<= last ) {
              //先找到中间的元素的下标 ， mid是首尾下标的和的一半
               int mid= (start+last)/2 ;
               if( sortedArray[mid] > number   ) {
                   last=mid-1;
               }else if(sortedArray[mid] <number ){
                   start=mid+1;
               }else {
                   return  mid;
               }

          }
         return  -1;

    }



}
