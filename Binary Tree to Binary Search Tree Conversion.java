import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//   You can improve the time complexity of the code using sets instead of sorting

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
class Solution
{
    List<Integer> list;
    class ptr{
        int val;
    }
    Node binaryTreeToBST(Node root)
    {
        list=new ArrayList<>();
        dfs(root);
        int[]array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        Arrays.sort(array);
        ptr ptr=new ptr();
        ptr.val=0;
        provider(root,array,ptr);
        return root;

    }
    void provider(Node n,int[]array,ptr ptr){
        if(n.left!=null){
            provider(n.left,array,ptr);
        }
        n.data=array[ptr.val];
        ptr.val++;
        if(n.right!=null){
            provider(n.right,array,ptr);
        }
    }
    void dfs(Node n){
        if(n.left!=null){dfs(n.left);}
        list.add(n.data);
        if(n.right!=null){dfs(n.right);}
    }

}
class Implementation {
    static void dfs(Node n){
        if(n.left!=null){dfs(n.left);}
        System.out.print(n.data+" ");
        if(n.right!=null){dfs(n.right);}
    }
    public static void main (String[] args){
        int[]a={10,5,1,7,20,40,50};
        Node n=new Node(1);
        n.left=new Node(2);
        n.left.left=new Node(4);
        n.right=new Node(3);
        Solution s=new Solution();
        n=s.binaryTreeToBST(n);
        dfs(n);
    }
}
