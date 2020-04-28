import java.lang.*;

//******************************DFS APPROACH********************************************

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
class custom{
    int dist;
    Node found;
    custom(int dist,Node found){
        this.dist=dist;
        this.found=found;
    }
}

class Tree{
    Node root;
    Node kthAncestor(int toFind,int k){
        return traverser(root,toFind,k).found;
    }
    custom traverser(Node n,int toFind,int k){
        if(n.data==toFind){
            return new custom(0,null);
        }
        custom left=null;
        custom right=null;
        if(n.left!=null){
            left=traverser(n.left,toFind,k);
        }
        if(n.right!=null){
            right=traverser(n.right,toFind,k);
        }
        custom found=null;
        if(left!=null){
            found=left;
        }
        if(right!=null){
            found=right;
        }
        if(found!=null){
            found.dist++;
            if(found.dist==k){
                found.found=n;
            }

        }
        return found;
    }

}
class Implementation {
    public static void main (String[] args){
        Tree t=new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.left.left.right=new Node(7);
        t.root.left.left.right.left=new Node(8);
        t.root.left.left.right.left.right=new Node(9);
        t.root.right=new Node(3);
        t.root.right.left=new Node(6);
        System.out.println(t.kthAncestor(9,5).data);
    }
}
