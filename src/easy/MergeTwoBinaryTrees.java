package easy;

import util.TreeNode;

public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);
		TreeNode res = new MergeTwoBinaryTrees().mergeTrees(t1, t2);
		System.out.println(res.val);
		System.out.println(res.left.val);
		System.out.println(res.left.left.val);
		System.out.println(res.left.right.val);
		System.out.println(res.right.val);
		System.out.println(res.right.right.val);
	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		TreeNode result = new TreeNode(t1.val + t2.val);
		result.left = mergeTrees(t1.left, t2.left);
		result.right = mergeTrees(t1.right, t2.right);
		return result;
	}

}
