import java.util.Arrays;

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
        int count=0;
        void swap(Node n){
            if(n.left!=null &&n.right!=null){
                if(n.left.data<n.data&&n.data<n.right.data){

                }
                else{
                    int[]temp=new int[3];
                    temp[0]=n.left.data;
                    temp[1]=n.data;
                    temp[2]=n.right.data;
                    Arrays.sort(temp);
                    n.left.data=temp[0];
                    n.data=temp[1];
                    n.right.data=temp[2];
                    count++;
                }

            }
            else if(n.left!=null&&n.right==null){
                if(n.left.data>n.data){
                    int temp=n.data;
                    n.data=n.left.data;
                    n.left.data=temp;
                    count++;
                }
            }
            else if(n.right!=null&&n.left==null){
                if(n.right.data<n.data){
                    int temp=n.data;
                    n.data=n.right.data;
                    n.right.data=temp;
                    count++;
                }
            }
            if(n.left!=null){
                swap(n.left);
            }
            if(n.right!=null){
                swap(n.right);
            }
        }
        int count(){
            count=0;
            swap(root);
            return count;
        }

    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            t.root=new Node(5 );
            t.root.right=new Node(7);
            t.root.left=new Node(6);
            t.root.left.right=new Node(9);
            t.root.left.left=new Node(8);
            t.root.right.left=new Node(10);
            t.root.right.right=new Node(11);
            System.out.println(t.count());
        }
    }
