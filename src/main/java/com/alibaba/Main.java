package com.alibaba;

import java.util.ArrayList;

/**
 * 功能描述：
 *
 * @author 曹世顺
 * @version 1.0
 * @date 2022/3/17 0017 19:06
 */
public class Main {
    public static void main(String[] args) {
        //平衡二叉树
        TreeNode node = new TreeNode();
        node.right = new TreeNode();
        node.right.right = new TreeNode();
        System.out.println(isBalanced(node));
    }

    public static boolean isBalanced(TreeNode root){
        if(root == null)
            return true;

        if(Math.abs(solve(root.left) - solve(root.right)) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int solve(TreeNode node){
        if(node == null)
            return 0;
        int left = solve(node.left);
        int right = solve(node.right);

        return Math.max(left, right) + 1;
    }

}

class TreeNode{
    public TreeNode right;
    public TreeNode left;
    public int val;
}
