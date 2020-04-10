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
        int sum(Node n){
            int left=0;
            int right=0;
            if(n.left!=null){
                left=sum(n.left);
            }
            if(n.right!=null){
                right=sum(n.right);
            }
            int temp=n.data;
            n.data=left+right;
            return (left+right+temp);
        }
        void dfs(Node n){
            System.out.print(n.data+" ");
            if(n.left!=null){
                dfs(n.left);
            }
            if(n.right!=null){
                dfs(n.right);
            }
        }

    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            t.root=new Node(10 );
            t.root.right=new Node(30);
            t.root.left=new Node(20);
            t.root.left.right=new Node(60);
            t.root.left.left=new Node(40);
            t.dfs(t.root);
            t.sum(t.root);
            System.out.println();
            t.dfs(t.root);
        }
    }
