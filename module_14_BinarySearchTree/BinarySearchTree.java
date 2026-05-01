public class BinarySearchTree<E> {
//    attributes
    private TreeNode<E> root; //think of this as the "head" from the LinkedList class

//    constructors
    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(TreeNode<E> root) {
        this.root = root;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }


}