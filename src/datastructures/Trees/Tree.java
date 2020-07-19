package datastructures.Trees;

public class Tree {
    private Node root;

    /**
     *
     * @param value
     */
    public void insert(int value){
        Node node = new Node(value);

        //case: if tree is empty
        if(root == null){
            root = node;
            return;
        }

        //case: tree is filled
        Node current = root;
        while(true){
            if(current.value > value){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }else{
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            if (current.value > value)
                current = current.leftChild;
            else
                current = current.rightChild;

            }
            return false;
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root){
        if(root == null)
            return;
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root == null)
            return -1;

        if(isLeaf())
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public boolean equals(Tree other){
        if(other == null)
            return false;

        return equals(root, other.root);
    }

    private boolean equals(Node root, Node other){
        if(root == null && other == null)
            return true;


        if(root != null && other != null)
            return root.value == other.value
                    && equals(root.rightChild, other.rightChild)
                    && equals(root.leftChild, other.leftChild);

        return false;
    }

    private boolean isLeaf(){
        return root.leftChild == null && root.rightChild == null;
    }

    public int min(Node root){
        if(isLeaf())
            return root.value;

        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public Node getRoot() {
        return root;
    }

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
