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
        boolean isSumTree(Node node)
        {
            int val=sum(node);
            if(val==-6969){
                return false;
            }
            else{
                return true;
            }
        }
        int sum(Node n){
            int left=0;
            int right=0;
            if(n.left!=null){
                left=sum(n.left);
            }
            if(n.right!=null){
                right=sum(n.right);
            }
            if(left==-6969||right==-6969){
                return -6969;
            }
            if(left==0&right==0){
                return n.data;
            }
            else{
                if(n.data!=left+right){
                    return -6969;
                }
                return n.data+left+right;
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
            System.out.println(t.isSumTree(t.root));
        }
    }
