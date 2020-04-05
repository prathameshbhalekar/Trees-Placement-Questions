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
class stack{
    List<node> stack=new ArrayList<node>();
    void add(node n){
        stack.add(n);
//        for(int i=0;i<stack.size();i++){
//            System.out.print(stack.get(i).data+",");
//        }
//        System.out.println();
    }
    node pop(){
//        for(int i=0;i<stack.size();i++){
//            System.out.print(stack.get(i).data+",");
//        }
//        System.out.println();
        return stack.remove(stack.size()-1);

    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
}
class tree{
    node root;
    node inorder(int num){
        stack s=new stack();
        node l=root;
        int count=1;
        while(l.left!=null){
            s.add(l);
            l=l.left;
        }
        s.add(l);
        while(!s.isEmpty()){
            node n=s.pop();
            if(count==num){
                return n;
            }
            count++;
            if(n.right!=null){
                s.add(n.right);
                if(n.right.left!=null){
                    node temp=n.right.left;
                    do{
                        s.add(temp);
                        temp=temp.left;
                    }while(temp!=null);
                }
            }
        }
        return null;
    }

}


public class Implementation {
    public static void main(String []args){
        tree t=new tree();
        t.root=new node(7);
        t.root.left=new node(2);
        t.root.right=new node(3);
        t.root.right.left=new node(8);
        t.root.right.right=new node(5);
        System.out.println(t.inorder(3).data);
    }
}

