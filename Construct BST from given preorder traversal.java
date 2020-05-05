import java.lang.*;

//********************************RECCURSIVE APPROACH*****************************************************8 

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

//  We create ptr class to pass reference of the ptr instead of value in reccurence
class ptr{
    int val;
}

class Tree{
    static Node createTree(int[]array){
        ptr ptr=new ptr();
        ptr.val=0;
        return bst(ptr,array,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private static Node bst(ptr ptr,int[]array,int left,int right){
        if(ptr.val>=array.length){
            return null;
        }
        if(array[ptr.val]<left||array[ptr.val]>right){
            return null;
        }
        Node n=new Node(array[ptr.val]);
        ptr.val++;
        n.left=bst(ptr,array,left,n.data);
        n.right=bst(ptr,array,n.data,right);
        return n;
    }
    static void dfs(Node n){
        if(n.left!=null){
            dfs(n.left);
        }
        System.out.print(n.data+" ");
        if(n.right!=null){
            dfs(n.right);
        }
    }
    
}
class Implementation {
    public static void main (String[] args){
        int[]a={10,5,1,7,20,40,50};
        Node n=Tree.createTree(a);
        Tree.dfs(n);

    }
}
