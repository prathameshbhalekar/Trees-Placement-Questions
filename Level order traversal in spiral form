   //~~~~~~~~~~~~~~~~~~~~~~~
    import java.util.*;

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

    class tree{
        node root;
        boolean check=false;
        void spiralView(){
            Queue<node>q=new LinkedList<node>();
            q.add(root);
            while(!q.isEmpty()){
                int size=q.size();
                Stack<node> s=new Stack<node>();
                for(int i=0;i<size;i++){
                    node poped=q.remove();
                    if(poped!=null) {
                        System.out.print(poped.data + ",");
                    }
                    if(check&&poped!=null) {
                        if (poped.left != null) {
                            s.push(poped.left);
                        }
                        if (poped.right != null) {
                            s.push(poped.right);
                        }
                    }
                    if(!check&&poped!=null){
                        if (poped.right != null) {
                            s.push(poped.right);
                        }
                        if (poped.left != null) {
                            s.push(poped.left);
                        }
                    }
                }

                while(!s.isEmpty()){
                    q.add(s.pop());
                }
                check=!check;
//                System.out.println(q.size());
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
            tree.spiralView();
        }
    }
