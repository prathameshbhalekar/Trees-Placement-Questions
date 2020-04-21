import java.lang.*;
import java.io.*;

//****************************RECURSIVE METHORD***********************************

class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class Tree{
    Node root;

    Node lca(Node n, int n1,int n2)
    {
        if(n.data==n1||n.data==n2){
            return n;
        }
        Node left=null;
        Node right=null;
        if(n.left!=null){
            left=lca(n.left,n1,n2);
        }
        if(n.right!=null){
            right=lca(n.right,n1,n2);
        }
        if(left!=null&&right!=null){
            return n;
        }
        else if(left!=null){
            return left;
        }
        else if(right!=null){
            return right;
        }
        else{
            return null;
        }
    }
}
class Implementation {
    public static void main (String[] args)throws IOException {
        Tree t=new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.left.left = new Node(3);
        t.root.left.right = new Node(4);
        System.out.println(t.lca(t.root,3,4).data);
    }
}
