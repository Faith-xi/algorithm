package dataStructure.binarytree;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：TreeNode
 * Create date： 2020/4/27 08:48
 * Description：TODO
 * Update history：
 * ================================================
 */
public class TreeNode implements TreeNodeInterface{

    public int key=0;
    public String data=null;
    public boolean isVisted=false;
    public TreeNode leftChild=null;
    public TreeNode rightChild=null;

    public TreeNode(){}

    /**
     * @param key  层序编码
     * @param data 数据域
     */
    public TreeNode(int key,String data){
        this.key=key;
        this.data=data;
        this.leftChild=null;
        this.rightChild=null;
    }


    @Override
    public void setLeftChildNode(TreeNode leftChildNode) {
        this.leftChild = leftChildNode;
    }

    @Override
    public void setRightChildNOde(TreeNode rightChildNode) {
        this.rightChild = rightChildNode;
    }
}
