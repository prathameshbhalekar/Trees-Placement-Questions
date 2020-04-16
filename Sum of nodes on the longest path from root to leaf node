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
    int sum=9999;
    int maxPos=-9999999;
    public int sumOfLongRootToLeafPath()
    {
        sum=9999;
        maxPos=-9999999;
        if(root==null){
            return 0;
        }
        dfs(root,0,0);
        return sum;
    }

    void dfs(Node n,int depth ,int s){
        if(n.left!=null){
            dfs(n.left,depth+1,s+n.data);
        }
        if(n.right!=null){
            dfs(n.right,depth+1,s+n.data);
        }
        if(n.left==null&&n.right==null){
            if(depth>maxPos){
                maxPos=depth;
                sum=s+n.data;
            }
            else if(depth==maxPos&&(s+n.data)>sum){
                sum=s+n.data;
            }
        }
    }
}
class Implementation {
    public static void main (String[] args)throws IOException {
        Tree t=new Tree();
        t.root=new Node(4);
        t.root.left=new Node(2);
        t.root.right=new Node(5);
        t.root.left.left=new Node(7);
        t.root.left.right=new Node(1);
        t.root.left.right.left=new Node(6);
        t.root.right.left=new Node(2);
        t.root.right.right=new Node(3);
        System.out.println(t.sumOfLongRootToLeafPath());
    }
}
