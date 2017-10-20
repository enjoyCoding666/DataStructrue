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

    public void insertNode(Node node,Node node0){

    }

    public void updateNode(){

    }

    /**
     *
     * @param nodeRemoved   要删掉的node
     * @param node  链表头
     *  如果需要移除的node是链表头或者链表尾，要仔细考虑细节
     *  如果要删除的是链表头，以下方法不可行
     */
    public void removeNode(Node nodeRemoved,Node node){
            if(nodeRemoved==node) {
              node.setNext(null);
            }
            Node next=nodeRemoved.getNext();
            while (node!=null) {
                if(node.getNext() == nodeRemoved ) {
                    node.setNext(next);
                    break;
                }
                node=node.getNext();
            }
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
}
