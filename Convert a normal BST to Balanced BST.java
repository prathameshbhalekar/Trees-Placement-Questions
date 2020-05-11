port java.lang.*;
import java.util.ArrayList;
import java.util.List;


//********************************PRINTING INORDER TRAVERSAL AND INSETING MIDDLE ELEMENT AND DIVIDING THE TRAVERSAL ARRAY****************

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
class tree{
    private static List<Integer>data;
    static void dfs(Node n){
        System.out.print(n.data+" ");
        if(n.left!=null){
            dfs(n.left);
        }
        if(n.right!=null){
            dfs(n.right);
        }
    }
    static Node balance(Node root){
        data=new ArrayList<>();
        inorder(root);
        return buildTree(0,data.size()-1);

    }

    private static Node buildTree(int start,int end){
        int mid=(start+end)/2;
        Node n=new Node(data.get(mid));
        if(mid!=start){
            n.left=buildTree(start,mid-1);
        }
        if(mid!=end){
            n.right=buildTree(mid+1,end);
        }
        return n;
    }

    private static void inorder(Node n){
        if(n.left!=null){
            inorder(n.left);
        }
        data.add(n.data);
        if(n.right!=null){
            inorder(n.right);
        }
    }
}
class Implementation {

    public static void main (String[] args){
        Node n=new Node(4);
        n.left=new Node(3);
        n.left.left=new Node(2);
        n.left.left.left=new Node(1);
        n.right=new Node(5);
        n.right.right=new Node(6);
        n.right.right.right=new Node(7);
        tree.dfs(tree.balance(n));
    }
}
