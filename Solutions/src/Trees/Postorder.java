package Trees;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(Node root) {
        if (root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
