package tree;




class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

}
 class binarytree{

   private Node root;

    binarytree(){

        this.root=null;
    }

    public  void Addnode(int value){
        if(this.root==null){
            this.root=new Node(value);
        }else {
            insert(this.root, value);
        }
    }




    private   Node insert(Node newnode, int key){
        if(newnode==null){
            return new Node(key);
        }
        if(key> newnode.data){
            newnode.right=insert(newnode.right,key);

        }else {
            newnode.left=insert(newnode.left,key);
        }
        return newnode;


    }

    public boolean check(int val){

        return search(root,val);
    }


    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }else
        return search(root.right, data);
    }

    public void del(int val){
        root=delete(root,val);
    }

    private Node delete(Node root,int data){
        if(root==null){
            return root;
        }
        if(data>root.data){
            root.right=delete(root.right,data);

        } else if (data< root.data) {
            root.left=delete(root.left,data);

        }
        else {
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            root.data=minimumval(root.left);
            root.left=delete(root.left, root.data);

        }
        return root;

    }

    private int minimumval(Node root){
        int minv= root.data;
        while (root.left!=null){
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }


    public  void printtree(){
        print(this.root);
    }

    private void print(Node root){
        if(root==null){
            return;
        }

        print (root.left);
        System.out.print (root.data + " ");
        print (root.right);


    }


     public int treeheight ()
     {
         return height (root);
     }

    private int height(Node node){
        if(node==null){
            return 0;
        }
        else {
            int leftheight=height(node.left);
            int rightheight=height(node.right);
            return Math.max(leftheight,rightheight)+1;
        }
    }


}