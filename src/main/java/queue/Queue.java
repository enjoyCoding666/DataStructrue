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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Queue queue = (Queue) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(frontNode, queue.frontNode)
                .append(rearNode, queue.rearNode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(frontNode)
                .append(rearNode)
                .toHashCode();
    }
}
