import java.util.ArrayList;
import java.util.List;

class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            left=right=null;
        }

    }

    class tree{
        Node root;
        List<Integer> l=new ArrayList<>();
        boolean check(Node root)
        {
            l.clear();
            dfs(root,0);
            int temp=l.get(0);
            for(int i=1;i<l.size();i++){
                if(l.get(i)!=temp){
                    return false;
                }
            }
            return true;
        }
        void dfs(Node n,int pos){
            if(n.left==null&&n.right==null){
                l.add(pos);
            }
            else{
                if(n.left!=null){
                    dfs(n.left,pos-1);
                }
                if(n.right!=null){
                    dfs(n.right,pos-1);
                }
            }
        }
    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            t.root=new Node(26 );
            t.root.right=new Node(3);
            t.root.left=new Node(10);
            t.root.left.right=new Node(6);
            t.root.left.left=new Node(4);
            t.root.right.left=new Node(1);
            t.root.right.right=new Node(2);
            System.out.println(t.check(t.root));

        }
    }
