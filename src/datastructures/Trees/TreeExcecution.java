package datastructures.Trees;

public class TreeExcecution {

    public static void main(String [] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("insert completed");

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(101);
        System.out.println("insert completed");

        //traverse
//        System.out.println("Traverse InOrder :::::");
//        tree.traverseInOrder();
//
//        System.out.println("Traverse PreOrder :::::");
//        tree.traversePreOrder();
//
//        System.out.println("Traverse PostOrder :::::");
//        tree.traversePostOrder();

        //System.out.println(tree.height());

//        System.out.println(tree.height());
        System.out.println(tree.equals(null));
    }
}
