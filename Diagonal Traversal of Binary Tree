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
class queue{
    List<custom> queue=new ArrayList<custom>();
    void add(node n,int pos){
        custom c=new custom(n,pos);
        queue.add(c);
    }
    custom pop(){
        return queue.remove(0);

    }
    boolean isEmpty(){
        return queue.isEmpty();
    }
}
class custom{
    node n;
    int pos;
    custom(node n,int pos){
        this.n=n;
        this.pos=pos;
    }
}
class tree{
    node root;
    void diagonalTraversal(){
        queue q=new queue();
        q.add(root,0);
        q.add(null,0);
        int current=0;
        List<ArrayList<custom>>list=new ArrayList<ArrayList<custom>>();
        list.add(new ArrayList<custom>());
        while(!q.isEmpty()){
            custom n=q.pop();
            if(n.n==null){
                current++;
                list.add(new ArrayList<custom>());
                q.add(null,0);
                if(q.queue.size()==1&&q.queue.get(0).n==null){
                    q.pop();
                }
            }
            else{
//                System.out.println(n.n.data);
                list.get(current).add(n);
                if(n.n.left!=null){
                    q.add(n.n.left,n.pos-1);
                }
                if(n.n.right!=null){
                    q.add(n.n.right,n.pos+1);
                }
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            int ind=count;
            count--;
            for(int j=i;j<list.size();j++){
                List <custom>l=list.get(j);
                int cc=0;
                for(int k=0;k<l.size();k++){
                    custom f=l.get(k);
                    if(f.pos==ind){
                        cc++;
                        System.out.print(f.n.data+",");
                        if(cc==2){
                            break;
                        }
                    }
                }

                ind++;
            }
            System.out.println();
        }
    }
}


public class Implementation {
    public static void main(String []args){
        tree tree=new tree();
        tree.root=new node(8);
        tree.root.left = new node(3);
        tree.root.right = new node(10);
        tree.root.left.left = new node(1);
        tree.root.left.right = new node(6);
        tree.root.right.right = new node(14);
        tree.root.right.right.left = new node(13);
        tree.root.left.right.left = new node(4);
        tree.root.left.right.right = new node(7);
        tree.diagonalTraversal();
    }
}
