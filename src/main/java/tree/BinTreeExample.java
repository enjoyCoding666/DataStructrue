package tree;

/**
 * 二叉树例子
 */
public class BinTreeExample {

    /**
     *    形成如下二叉树
     *           A
     *        B     C
     *      D  E  F   G
     *    @return
     */
    public TreeNode initBinTree(){
        TreeNode nodeD=new TreeNode(null,"D",null);
        TreeNode nodeE=new TreeNode(null,"E",null);
        TreeNode nodeF=new TreeNode(null,"F",null);
        TreeNode nodeG=new TreeNode(null,"G",null);
        TreeNode nodeB=new TreeNode(nodeD,"B",nodeE);
        TreeNode nodeC=new TreeNode(nodeF,"C",nodeG);
        TreeNode nodeA=new TreeNode(nodeB,"A",nodeC);

        return nodeA;
    }


    
}
