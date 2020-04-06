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
        void printBoundary()
        {
            if(root==null){
                return;
            }
            node n=root;
            if(n.left==null){
                System.out.print(n.data+" " );
            }

            while(n.left!=null){
                System.out.print(n.data+" ");
                n=n.left;
                if(n.left==null){
                    if(n.right!=null){

                        while(n.left==null&&n.right!=null){
                            System.out.print(n.data+" ");
                            n=n.right;
                        }
                    }
                }
            }
            traverser(root);

            if(root.right!=null){
                n=root.right;
                Stack<node>s=new Stack<>();
                if(n.right==null&&n.left!=null){
                    while(n.right==null&&n.left!=null){
                        s.push(n);
                        n=n.left;
                    }
                }
                while(n.right!=null){
                    s.push(n);
                    n=n.right;
                    if(n.right==null){
                        if(n.left!=null){

                            while(n.right==null&&n.left!=null){
                                s.push(n);
                                n=n.left;
                            }
                        }
                    }
                }
                while(!s.isEmpty()){
                    System.out.print(s.pop().data+" ");
                }}

        }
        void traverser(node n){
            if(n.left==null&&n.right==null){
                System.out.print(n.data+" ");
            }
            else{
                if(n.left!=null){
                    traverser(n.left);
                }
                if(n.right!=null){
                    traverser(n.right);
                }
            }
        }
    }


    public class Implementation {
        public static void main(String []args){
            tree tree=new tree();
            tree.root=new node(1);
            tree.root.left = new node(2);
            tree.root.right = new node(3);
            tree.root.left.left = new node(4);
            tree.root.left.right = new node(5);
            tree.root.right.right = new node(7);
            tree.root.right.right.right = new node(8);
            tree.root.left.right.right = new node(6);
            tree.printBoundary();
        }
    }
