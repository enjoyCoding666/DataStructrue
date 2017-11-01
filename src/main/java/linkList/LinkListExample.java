package linkList;


public class LinkListExample {
    public Node insertByOrder(Node node0 , int number ){
         if(number<0) {
             System.out.println("请在链表中插入正整数.");
         }
         Node node=node0;
         //处理number<=链表头的情况
         if(node.getIntElement()>=number) {
             Node node1=new Node(number,node);
             return  node1;
         }
         while (node!=null ) {
             int nodeNumber=node.getIntElement();
             //处理number>=链表尾数的情况
             if(node.next==null) {
                 Node node1=new Node(number,null);
                 node.setNext(node1);
                 break;
             }
             int nextNumber=node.next.getIntElement();
             if(number >= nodeNumber && number<=nextNumber) {
                 Node node1=new Node(number,node.next);
                 node.next=node1;
                 break;
             }
             node=node.next;
         }
      return node0;
    }


}
