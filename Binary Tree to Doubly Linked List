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
        Node head;
        Node current;
        void add(int data){
            if(head==null){
                head=new Node(data);
                current=head;
            }
            else{
                current.right=new Node(data);
                current.right.left=current;
                current=current.right;

            }
        }
        Node bToDLL(Node root)
        {

            dfs(root);
            return head;
        }
        void dfs(Node n){

            if(n.left!=null){
                dfs(n.left);
            }
            add(n.data);
            if(n.right!=null){
                dfs(n.right);
            }
        }
        void printList(){
            Node n=head;
            while(n.right!=null){
                System.out.print(n.data+" ");
                n=n.right;
            }
            System.out.print(n.data);
            System.out.println();
            while (n.left!=null){
                System.out.print(n.data+" ");
                n=n.left;
            }
            System.out.print(n.data);
            System.out.println();
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
            t.bToDLL(t.root);
            t.printList();
        }
    }
