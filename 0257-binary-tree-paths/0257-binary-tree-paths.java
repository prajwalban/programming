class Solution {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return result;
        }

        dfs(root, "");

        return result;
    }

    void dfs(TreeNode root, String path) {

        path += root.val;

        
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        path += "->";

        if (root.left != null) {
            dfs(root.left, path);
        }

        if (root.right != null) {
            dfs(root.right, path);
        }
    }
}