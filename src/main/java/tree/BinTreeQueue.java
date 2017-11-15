package tree;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BinTreeQueue {
    private  Object frontNode;
    private Object rearNode;

    public Object getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(Object frontNode) {
        this.frontNode = frontNode;
    }

    public Object getRearNode() {
        return rearNode;
    }

    public void setRearNode(Object rearNode) {
        this.rearNode = rearNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BinTreeQueue that = (BinTreeQueue) o;

        return new EqualsBuilder()
                .append(frontNode, that.frontNode)
                .append(rearNode, that.rearNode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(frontNode)
                .append(rearNode)
                .toHashCode();
    }
}
