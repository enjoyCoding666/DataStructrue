package linkList;

import java.util.List;

/**
 *  @author lin
 *  链表的相关操作
 **/
public class LinkListOperation {
    /**
     * @param element  想要找的元素
     * @param node   链表头
     * @return 是否能找到对应节点Node
     */
    public boolean findNode(Object element,Node node){
        while (node !=null){
            if(element.equals( node.getElement()) ) {
                System.out.println("已找到对应节点元素"+element);
                return true;
            }
            node=node.getNext();
        }
        System.out.println("未找到对应节点元素.");
        return false;
    }

    /**
     *
     * @param node 链表头
     * @param node1 在何处后面插入节点
     * @param node2 要插入的节点
     * @return 插入后生成的链表
     */
    public Node insertNode(Node node,Node node1,Node node2){
        Node node0=node;
        while (node!=null) {
             if(node ==node1){
                     Node node3=node1.getNext();
                     node2.setNext(node3);
                     node.setNext(node2);
                     break;
             }
             node=node.getNext();
        }
        return node0;
    }

    /**
     *
     * @param node   链表头
     * @param node1   要修改的节点
     * @param node2   修改后的节点
     * @return   更新完成后的链表头
     */
    public Node updateNode(Node node,Node node1,Node node2){
        Node node0=node;
        while (node!=null) {
            if(node.getNext()==node1) {
               Node node3=node1.getNext();
               node2.setNext(node3);
               node.setNext(node2);
               break;
            }
            node=node.getNext();
        }
        return node0;
    }

    /**
     *
     * @param nodeRemoved   要删掉的node
     * @param node  链表头
     *  如果需要移除的node是链表头或者链表尾，要仔细考虑细节
     *  如果链表只有一个节点，也要注意
     */
    public Node removeNode(Node nodeRemoved,Node node){
            Node node0=node;
            if(nodeRemoved==node0) {
                Node node1=node.getNext();
                node.setNext(null);
                return  node1;
            }
            Node next=nodeRemoved.getNext();
            while (node!=null) {
                if(node.getNext() == nodeRemoved ) {
                    node.setNext(next);
                    break;
                }
                node=node.getNext();
            }
            return node0;
    }

    /**
     *
     * @param node  链表头
     */
    public void listNode(Node node){
           while (node!=null) {
               System.out.println(node.getElement());
               node=node.getNext();
           }
    }

    /**
     *
     * @param node  链表头
     * @param k     正整数序号
     * @return      链表第k个节点
     */
    public Node findKthNode(Node node,int k){
        int i=0;
        while (node!=null && i!=k){
            node=node.getNext();
            i++;
        }
        return node;
    }
}
