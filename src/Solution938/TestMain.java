package Solution938;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        return 0;
    }
    public static void main(String[] args) {
		Integer []root = {10,5,15,3,7,null,18};//, L = 7, R = 15
    	TreeNode node1 = new TreeNode(10);
    	TreeNode node2 = new TreeNode(5);
    	TreeNode node3 = new TreeNode(15);
    	TreeNode node4 = new TreeNode(3);
    	TreeNode node5 = new TreeNode(7);
    	TreeNode node6 = new TreeNode(18);
    	
    	//1。创建一棵树
    	int count=0;
    	TreeNode curNode=null;
    	TreeNode rootNode=null;
    	for(Integer val :root){
    		if(count==0){//只有根节点使用
    			rootNode=new TreeNode(val);
    		}else{//非根节点使用
    		 boolean left=	val<rootNode.val?true:false;//判断左右节点
    		 if(left){
    			 rootNode.left=new TreeNode(val); 
    		 }else{
    			 rootNode.right=new TreeNode(val);  
    		 }
    		}
    		
    		
    	}
	}
    
    public static void listAll(TreeNode node){
//    	node.
    }
}
