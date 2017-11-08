package queue;

import linkList.Node;

/**
 * @author  lin
 */
public class QueueOperation {
    public Queue addQueue(Queue queue,Object element){
        Node rearNode=queue.getRearNode();
        Node node=new Node(element,null);
        rearNode.setNext(node);
        queue.setRearNode(node);
        return  queue;
    }

    public Queue deQueue(Queue queue){
        Node frontNode=queue.getFrontNode();
        Node rearNode=queue.getRearNode();
        if(  (frontNode.equals(rearNode))   || frontNode==null || rearNode==null ) {
              return null;
        }
        Node node=frontNode.getNext();
        frontNode.setNext(null);
        queue.setFrontNode(node);
        return queue;
    }
}
