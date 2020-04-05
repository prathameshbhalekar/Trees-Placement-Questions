import java.util.ArrayList;
import java.util.List;

class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class storage{
    node n;
    int pos;
    storage(node n,int pos){
        this.n=n;
        this.pos=pos;
    }
}
class queue{
    List <storage> queue=new ArrayList<storage>();
    void add(storage data) {
    	queue.add(data);
    }
    storage pop() {
    	storage s=queue.remove(0);
    	return s;
    }
    boolean isEmpty() {
    	return queue.isEmpty();
    }
    
}
class tree{
    node root;
    void topView() {
    	queue q=new queue();
    	List <node>left=new ArrayList<node>();
    	List <node>right=new ArrayList<node>();
    	int rightPos=0;
    	int leftPos=0;
        storage s=new storage(root,0);
    	q.add(s);
    	while(!q.isEmpty()) {
    		storage poped=q.pop();
    		node n=poped.n;
    		int pos=poped.pos;
    		if(pos<leftPos) {
    			left.add(n);
    			leftPos=pos;
    		}
    		if(pos>rightPos) {
    			right.add(n);
    			rightPos=pos;
    		}
    		if(n.left!=null) {
    			storage newLeft=new storage(n.left,pos-1);
    			q.add(newLeft);
    		}
    		if(n.right!=null) {
    			storage newRight=new storage(n.right,pos+1);
    			q.add(newRight);
    		}
    	}
    	for(int i=left.size()-1;i>=0;i--) {
    		System.out.print(left.get(i).data+",");
    	}
    	System.out.print(root.data+",");
    	for(int i=0;i<right.size();i++) {
    		System.out.print(right.get(i).data+",");
    	}
    }

}
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		tree tree=new tree();
		tree.root=new node(1);
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		tree.root.left.right=new node(4);
		tree.root.left.right.right=new node(5);
		tree.root.left.right.right.right=new node(6);
		tree.topView();
		

	}

}
