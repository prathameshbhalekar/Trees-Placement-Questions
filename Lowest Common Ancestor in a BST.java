class Implementation {
    static Node LCA(Node node, int n1, int n2)
    {
        return traverse(node,Integer.MIN_VALUE,Integer.MAX_VALUE,n1,n2);
    }

    static Node traverse(Node n, int min, int max, int n1, int n2){
        //  If n is one of the node 
        if(n.data==n1||n.data==n2){
            if(n.data==n2){
                int temp=n1;
                n1=n2;
                n2=temp;
            }
            //  If the other node if one of the child of this node, This node is the ancestor
            if ((n2<n.data&&n2>min)||(n2>n.data&&n2<max)){
                return n;
            }
            else{
                return null;
            }
        }
        else{
            int n1pos=Integer.MAX_VALUE;
            int n2pos=Integer.MAX_VALUE;
            if(n1<n.data&&n1>min){
                n1pos=-1;
            }
            if(n1>n.data&&n1<max){
                n1pos=1;
            }
            if(n2<n.data&&n2>min){
                n2pos=-1;
            }
            if(n2>n.data&&n2<max){
                n2pos=1;
            }
            if (n1pos==n2pos&&n1pos==1){
                //   If both nodes are on right
                if(n.right!=null){
                    return traverse(n.right,n.data,max,n1,n2);
                }
                else{a
                    return null;
                }
            }
            if(n1pos==n2pos&&n1pos==-1){
                //   If both nodes are on left
                if(n.left!=null){
                    return traverse(n.left,min,n.data,n1,n2);
                }
            }
            if((n1pos==1&&n2pos==-1)||(n1pos==-1&&n2pos==1)){
                //  If one node is on left and other is on right, this node is the ancestor
                return n;
            }

            return null;

        }
    }

    public static void main (String[] args){
        Node n=new Node(4);
        n.left=new Node(3);
        n.left.left=new Node(2);
        n.left.left.left=new Node(1);
        n.right=new Node(5);
        n.right.right=new Node(6);
        n.right.right.right=new Node(7);
        System.out.println(LCA(n,1,7).data);
    }
}
