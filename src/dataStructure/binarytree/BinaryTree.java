package dataStructure.binarytree;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：BinaryTree
 * Create date： 2020/4/19 17:21
 * Description：TODO 二叉树的实现类
 * Update history：
 * ================================================
 */
public class BinaryTree implements BinaryTreeInterface{

    private TreeNode rootNode = null;

    public BinaryTree(TreeNode rootNode){
        this.rootNode = rootNode;
    }

    @Override
    public void creatBinaryTree(TreeNode rootNode) {

    }

    @Override
    public void creatBinaryTree() {
        TreeNode newNodeB = new TreeNode(2,"B");
        TreeNode newNodeC = new TreeNode(3,"C");
        TreeNode newNodeD = new TreeNode(4,"D");
        TreeNode newNodeE = new TreeNode(5,"E");
        TreeNode newNodeF = new TreeNode(6,"F");
        rootNode.setLeftChildNode(newNodeB);
        rootNode.setRightChildNOde(newNodeC);
        newNodeB.setLeftChildNode(newNodeD);

    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public TreeNode getLeftChildNode() {
        return null;
    }

    @Override
    public TreeNode getRightChildNode() {
        return null;
    }

    @Override
    public TreeNode getRoot() {
        return rootNode;
    }
}
