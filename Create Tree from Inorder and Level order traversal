    import java.util.*;

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    class tree{
        class custom{
            int start;
            int end;
            Node n;
            custom(int start,int end,Node n){
                this.start=start;
                this.end=end;
                this.n=n;
            }
        }
        Node buildTree(int ino[], int bfs[])
        {
            Node root=new Node(bfs[0]);
            Queue <custom>q=new LinkedList<>();
            q.add(new custom(0,ino.length-1,root));
            int count=0;
            while(!q.isEmpty()){
                custom n=q.remove();
                int pos=999;
                for(int i=n.start;i<=n.end;i++){
                    if(ino[i]==bfs[count]){
                        pos=i;
                        break;
                    }
                }
                n.n.data=bfs[count];
                count++;
                if(pos!=n.start){
                    n.n.left=new Node(0);
                    q.add(new custom(n.start,pos-1,n.n.left));
                }
                if(pos!=n.end){
                    n.n.right=new Node(0);
                    q.add(new custom(pos+1,n.end,n.n.right));
                }
            }
            return root;
        }
        void preorder(Node n){
            System.out.print(n.data+" ");
            if(n.left!=null){
                preorder(n.left);
            }if(n.right!=null){
                preorder(n.right);
            }
        }
    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            int[]ino={7,3,8,1,9,4,10,0,11,5,12,2,13,6,14};
            int[]bfs={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
            Node root=t.buildTree(ino,bfs);
            t.preorder(root);
        }
    }
