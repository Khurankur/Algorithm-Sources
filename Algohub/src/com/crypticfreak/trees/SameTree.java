package javacodes.trees;

/**
 * Created by Ankur K on 5/7/14.
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * http://oj.leetcode.com/problems/same-tree/
*/
public class SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
  }
}
