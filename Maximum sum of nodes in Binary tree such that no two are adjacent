import java.util.*;
import java.lang.*;
import java.io.*;
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
    int largestSum(){
        return dfs(root);

    }
    int dfs(Node n){
        int left=0;
        int right=0;
        if (n.left != null) {
            left=dfs(n.left);
        }
        if(n.right!=null){
            right=dfs(n.right);
        }
        if((left+right)>n.data){
            return (left+right);
        }
        else{
            return n.data;
        }
    }
}
class Implementation {
    public static void main (String[] args)throws IOException {
        Tree t=new Tree();
        t.root=new Node(1);
        t.root.left=new Node(2);
        t.root.right=new Node(3);
        t.root.left.left=new Node(1);
//        t.root.left.right=new Node(5);
//        t.root.left.right.left=new Node(6);
        t.root.right.left=new Node(4);
        t.root.right.right=new Node(5);
        System.out.println(t.largestSum());
    }
}
