public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        TreeNode nodeLeft = root.left;
        TreeNode nodeRigth = root.right;

        return symmetricNode(nodeLeft, nodeRigth);

    }

    private boolean symmetricNode(TreeNode nodeLeft, TreeNode nodeRigth) {

        if (nodeLeft == null && nodeRigth == null)
        {
            return true;
        }

        if (nodeLeft == null || nodeRigth ==null){
            return false;
        }

        return (nodeLeft.val == nodeRigth.val && symmetricNode(nodeLeft.left, nodeRigth.right) && symmetricNode(nodeLeft.right, nodeRigth.left));

    }

}

