package queue;

import linkList.Node;

public class Queue {
      private Node  frontNode;
      private Node rearNode;

    public Queue(Node frontNode, Node rearNode) {
        this.frontNode = frontNode;
        this.rearNode = rearNode;
    }

    public Node getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(Node frontNode) {
        this.frontNode = frontNode;
    }

    public Node getRearNode() {
        return rearNode;
    }

    public void setRearNode(Node rearNode) {
        this.rearNode = rearNode;
    }
}
