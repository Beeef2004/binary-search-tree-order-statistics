class TreeNode {
    int key;
    int size;
    TreeNode left;
    TreeNode right;

    TreeNode(int key) {
        this.key = key;
        this.size = 1;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {

    public static int selectIthLargestElement(TreeNode root, int i) {
        return selectIthLargest(root, i);
    }

    private static int selectIthLargest(TreeNode node, int i) {
        if (node == null) {
            throw new IllegalArgumentException("Invalid input: i is out of bounds");
        }

        int rightSize = (node.right != null) ? node.right.size : 0;
        int rankOfCurrentNode = rightSize + 1;

        if (i == rankOfCurrentNode) {
            return node.key;
        } else if (i < rankOfCurrentNode) {
            return selectIthLargest(node.right, i);
        } else {
            return selectIthLargest(node.left, i - rankOfCurrentNode);
        }
    }

    public static void updateSize(TreeNode node) {
        if (node == null) return;
        node.size = 1 + ((node.left != null) ? node.left.size : 0) + ((node.right != null) ? node.right.size : 0);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        updateSize(root.left.left);
        updateSize(root.left.right);
        updateSize(root.left);
        updateSize(root.right.left);
        updateSize(root.right.right);
        updateSize(root.right);
        updateSize(root);

        int i = 1;
        int result = selectIthLargestElement(root, i);
        System.out.println(i + "rd largest element is: " + result);
    }
}
