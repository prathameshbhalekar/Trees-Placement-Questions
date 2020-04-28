import java.lang.*;

//**************************************************RECCURSIVE APPROACH*****************************************************

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
}
class Implementation {
    static boolean isIsomorphic(Node n1, Node n2)
    {
        if(n1.left==null||n2.left==null||n1.right==null||n2.right==null){
            //If left and right both are null 
            if(n1.left==null&&n2.left==null&&n1.right==null&&n2.right==null){
                if(n1.data==n2.data){return true;}
                else{return false;}
            }
            //If left of both node are null
            if(n1.left==null&&n2.left==null&&n1.right!=null&&n2.right!=null){return isIsomorphic(n1.right,n2.right)&&(n1.data==n2.data);}
            //If right of both node are null
            if(n1.left!=null&&n2.left!=null&&n1.right==null&&n2.right==null){return isIsomorphic(n1.left,n2.left)&&(n1.data==n2.data);}
            //If left of n1 and right of n2 is null
            if(n1.left==null&&n2.left!=null&&n1.right!=null&&n2.right==null){return isIsomorphic(n1.right,n2.left)&&(n1.data==n2.data);}
            //If right of n1 and left of n2 is null
            if(n1.left!=null&&n2.left==null&&n1.right==null&&n2.right!=null){return isIsomorphic(n1.left,n2.right)&&(n1.data==n2.data);}
            return false;
        }
        else{
            return ((isIsomorphic(n1.left,n2.left)&&isIsomorphic(n1.right,n2.right)&&(n1.data==n2.data))||(isIsomorphic(n1.left,n2.right)&&isIsomorphic(n1.right,n2.left))&&(n1.data==n2.data));
        }
    }
    public static void main (String[] args){
        Tree t1=new Tree();
        Tree t2=new Tree();
        t1.root=new Node(1);
        t1.root.left=new Node(2);
        t1.root.right=new Node(3);
        t1.root.left.left=new Node(4);
        t1.root.left.right=new Node(5);
        t1.root.left.right.left=new Node(7);
        t1.root.left.right.right=new Node(8);
        t1.root.right.left=new Node(6);
        t2.root=new Node(1);
        t2.root.left=new Node(3);
        t2.root.right=new Node(2);
        t2.root.right.left=new Node(4);
        t2.root.right.right=new Node(5);
        t2.root.right.right.left=new Node(8);
        t2.root.right.right.right=new Node(7);
        t2.root.left.left=new Node(6);
        System.out.println(isIsomorphic(t1.root,t2.root));
    }
}
