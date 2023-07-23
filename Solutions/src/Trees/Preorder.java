package Trees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> list=new ArrayList<Integer>();
        preorder(root,list);
        return list;
    }
    public void preorder(Node root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
