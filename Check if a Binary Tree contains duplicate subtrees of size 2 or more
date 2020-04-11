import java.util.ArrayList;
import java.util.List;

class Node{
        char data;
        Node left;
        Node right;
        Node (char data){
            this.data=data;
            left=right=null;
        }

    }

    class tree{
        Node root;
         List <String>l=new ArrayList<String>();
        public  boolean dupSub(Node root)
        {
            l.clear();
            dfs(root);
            // for(int i=0;i<l.size();i++){
            //     System.out.print(l.get(i)+" ");
            // }
            // System.out.println();
            for(int i=0;i<l.size();i++){
                String num=l.get(i);
                // System.out.print(num+" ");
                for(int j=i+1;j<l.size();j++){

                    if(l.get(j).equals(num)){
                        return true;
                    }
                }
            }
            // System.out.println();
            return false;
        }
         void dfs(Node n){
            if(n.left!=null){
                dfs(n.left);
            }
            if(n.left!=null||n.right!=null){
                String s="";
                if(n.left!=null){
                    s=s+n.left.data;
                }
                else {
                    s=s+"0";
                }
                s=s+n.data;
                if(n.right!=null){
                    s=s+n.right.data;
                }
                else{
                    s=s+"0";
                }
                l.add(s);}
            if(n.right!=null){
                dfs(n.right);
            }

        }
    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            t.root=new Node('a' );
            t.root.right=new Node('c');
            t.root.left=new Node('b');
            t.root.left.right=new Node('e');
            t.root.left.left=new Node('d');
            t.root.right.right=new Node('b');
            t.root.right.right.right=new Node('e');
            t.root.right.right.left=new Node('d');
            System.out.println(t.dupSub(t.root));

        }
    }
