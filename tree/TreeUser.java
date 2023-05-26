package tree;

public class TreeUser {
    public static void main(String[] args) {





        binarytree tree=new binarytree();

        tree.Addnode(20);
        tree.Addnode(30);
        tree.Addnode(40);
        tree.printtree();
        tree.Addnode(-3);
        tree.Addnode(0);
        tree.printtree();


        //tree.printtree();
        System.out.println(  tree.check(30));
        System.out.println(tree.check(35));
        tree.del(30);
        tree.printtree();
        System.out.println(tree.check(40));
        System.out.println(tree.treeheight());
        tree.Addnode(50);
        tree.Addnode(6);
        tree.printtree();
/*
       // tree.print(tree.root);
        //ystem.out.println();

        //tree.del(20);

        tree.print(tree.root);

        System.out.println();





       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       tree.root.right.left = new Node(6);
       tree.root.right.right = new Node(7);


        tree.print(tree.root);

        System.out.println();

        System.out.println("height of tree"+ tree.treeheight());

        tree.del(1);
        tree.print(tree.root);
        System.out.println();
        System.out.println( tree.check(5));

*/

    }
}
