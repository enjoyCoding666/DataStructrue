package tree;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 二叉树节点
 * @author lin
 */
public class TreeNode {
    TreeNode leftTree;
    Object element;
    TreeNode rightTree;


    public TreeNode(TreeNode leftTree, Object element, TreeNode rightTree) {
        this.leftTree = leftTree;
        this.element = element;
        this.rightTree = rightTree;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TreeNode treeNode = (TreeNode) o;

        return new EqualsBuilder()
                .append(leftTree, treeNode.leftTree)
                .append(element, treeNode.element)
                .append(rightTree, treeNode.rightTree)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(leftTree)
                .append(element)
                .append(rightTree)
                .toHashCode();
    }
}
