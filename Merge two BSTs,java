import java.util.*;

class Node{
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    Node left;
    Node right;
    int data;
}

class Solution{
    List<Integer>traversal1;
    List<Integer>traversal2;
    public List<Integer> merge(Node root1,Node root2)
    {
        traversal1=new ArrayList<>();
        traversal2=new ArrayList<>();
        traverser1(root1);
        traverser2(root2);
        int ptr1=0;
        int ptr2=0;
        List<Integer>fin=new ArrayList<>();
        while(ptr1<traversal1.size()&&ptr2<traversal2.size()){
            if(traversal1.get(ptr1)<traversal2.get(ptr2)){
                fin.add(traversal1.get(ptr1));
                ptr1++;
            }
            else{
                fin.add(traversal2.get(ptr2));
                ptr2++;
            }
        }
        while(ptr1<traversal1.size()){
            fin .add(traversal1.get(ptr1));
            ptr1++;
        }
        while(ptr2<traversal2.size()){
            fin .add(traversal2.get(ptr2));
            ptr2++;
        }
        return fin;
        
    }
    void traverser1( Node n){
        if(n.left!=null){
            traverser1(n.left);
        }
        traversal1.add(n.data);
        if(n.right!=null){
            traverser1(n.right);
        }
    }
    
    void traverser2( Node n){
        if(n.left!=null){
            traverser2(n.left);
        }
        traversal2.add(n.data);
        if(n.right!=null){
            traverser2(n.right);
        }
    }
}


public class Main
{
	public static void main(String[] args) {
		Node n1=new Node(8);
		n1.left=new Node(2);
		n1.left.left=new Node(1);
		n1.right=new Node(10);
		Node n2=new Node(5);
		n2.left=new Node(3);
		n2.left.left=new Node(0);
		Solution s=new Solution();
		List<Integer>l=s.merge(n1,n2);
		for(int i:l){
		    System.out.print(i+" ");
		}
	}
}
