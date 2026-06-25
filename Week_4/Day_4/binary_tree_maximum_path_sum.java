class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(gain(node.left), 0);
        int rightGain = Math.max(gain(node.right), 0);

        maxSum = Math.max(maxSum, node.val + leftGain + rightGain);

        return node.val + Math.max(leftGain, rightGain);
    }
}