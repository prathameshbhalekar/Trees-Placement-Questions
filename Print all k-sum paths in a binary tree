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
    void kSum(int sum){
        dfs(root,new ArrayList<Integer>(),sum);
    }
    
    
    void dfs(Node n,List<Integer>list,int sum){
        list.add(n.data);
        int current=0;
        for(int i=list.size()-1;i>=0;i--){
            current=current+list.get(i);
            if(current==sum){
                for(int j=i;j<list.size();j++){
                    System.out.print(list.get(j)+" ");
                }
                System.out.println();
            }
        }
        if(n.left!=null){
            //We need to create a new list otherwise we pass the same reference in left as well as right subtree
            List<Integer>left=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                left.add(list.get(i));
            }
            dfs(n.left,left,sum);
        }
        if(n.right!=null){
            dfs(n.right,list,sum);
        }

    }
}
class Implementation {
    public static void main (String[] args)throws IOException {
        Tree t=new Tree();
        t.root = new Node(1);
        t.root.left = new Node(3);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(1);
        t.root.left.right.left = new Node(1);
        t.root.right = new Node(-1);
        t.root.right.left = new Node(4);
        t.root.right.left.left = new Node(1);
        t.root.right.left.right = new Node(2);
        t.root.right.right = new Node(5);
        t.root.right.right.right = new Node(6);
        t.kSum(5);
    }
}
