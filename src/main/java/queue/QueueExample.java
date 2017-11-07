package queue;

import linkList.Node;
import linkList.NodeExample;

public class QueueExample {
    /**
     * 初始化一个队列头为存放元素0的节点node0，队列尾为存放元素5的节点node5
     * @return
     */
    public Queue initQueue(){
        Node node0=new NodeExample().initial();
        Node node=node0;
        while (node!=null) {
            node=node.getNext();
        }
        Queue queue=new Queue(node0,node);
        return queue;
    }


}
