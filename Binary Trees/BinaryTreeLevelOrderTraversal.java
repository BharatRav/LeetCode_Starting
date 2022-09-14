/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listoflist=new ArrayList<>();
        if(root==null){
            return listoflist;
        }
        
        Queue<TreeNode> qu=new LinkedList<>();
        List<Integer> currentList= new ArrayList<>();
        qu.offer(root);
        qu.offer(null);
        while(!qu.isEmpty()){
            TreeNode temp=qu.poll();
            if(temp!=null){
                currentList.add(temp.val);
                
                if(temp.left!=null){
                    qu.offer(temp.left);
                }
                if(temp.right!=null){
                    qu.offer(temp.right);
                }
            }else{
                List<Integer> TempList=new ArrayList<>(currentList);
                listoflist.add(TempList);
                if(!qu.isEmpty()){
                    qu.offer(null);
                }
                currentList.clear();
            }
        }
        return listoflist;
    }
}
