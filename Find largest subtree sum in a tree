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
    int maxSum=-999999;
    public int largestSubtree()
    {
        maxSum=-999999;
        dfs(root);
        return  maxSum;
    }

    int dfs(Node n){
       int sum1=0;
       int sum2=0;
        if(n.left!=null){
            sum1=dfs(n.left);
        }
        if(n.right!=null){
            sum2=dfs(n.right);
        }
        int sum=n.data+sum1+sum2;
        if(sum>maxSum){
            maxSum=sum;
        }
        return sum;
    }
}
class Implementation {
    public static void main (String[] args)throws IOException {
        Tree t=new Tree();
        t.root=new Node(1);
        t.root.left=new Node(-2);
        t.root.right=new Node(3);
        t.root.left.left=new Node(4);
        t.root.left.right=new Node(5);
//        t.root.left.right.left=new Node(6);
        t.root.right.left=new Node(-6);
        t.root.right.right=new Node(2);
        System.out.println(t.largestSubtree());
    }
}
