import java.lang.*;

//***************************************RECCURSSIVE APPROACH*******************************************************

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
    int findDist(int a, int b) {
        return getDist(root,a,b).dist;
    }
    class custom{
        custom(int dist,boolean found){
            this.dist=dist;
            this.found=found;
        }
        int dist;
        boolean found;
    }
    custom getDist(Node n,int a,int b){
        custom left=null;
        custom right=null;

        if(n.left!=null){
            left=getDist(n.left,a,b);
        }

        if(n.right!=null){
            right=getDist(n.right,a,b);
        }
        if(n.data==a||n.data==b){
            // to check is any of grand child is the second number
            if(left!=null){
                return new custom(left.dist,true);
            }
            if(right!=null){
                return new custom(right.dist,true);
            }
            
            //if no grand child is the second number
            return new custom(1,false);
        }
        
        //if left subtree has one number and right subtree has second number 
        if(left!=null&&right!=null){
            return new custom(left.dist+right.dist,true);
        }
        
        
        if(left!=null){
            //if left subtree has one number and second number is not found 
            if(!left.found){
                return new custom(left.dist+1,false);}
            
            //If both numbers are already found in the left subtree
            else{
                return left;
            }
        }
        
        
        if(right!=null){
            //If right subtree has one number and second  umber is not found
            if(!right.found){
                return new custom(right.dist+1,false);}
            
            //If both numbers are already found in the right subtree
            else{
                return right;
            }
        }
        
        //If none of the numbers are found
        return null;

    }

}
class Implementation {
    public static void main (String[] args){
        Tree t=new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right=new Node(3);
        t.root.right.left=new Node(6);
        System.out.println(t.findDist(6,4));
    }
}
