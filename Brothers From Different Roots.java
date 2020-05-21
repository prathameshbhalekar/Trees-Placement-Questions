class Implementation {
    static int count;
    public static int countPairs(Node root1, Node root2, int x)
    {
        count=0;
        traverse(root1,x,root2);
        return count;
    }
    
    //  Traverse throung all elements of one tree
    private static void traverse(Node n,int k,Node n2){
        if(n.left!=null){
            traverse(n.left,k,n2);
        }
        //   Check if the other tree contains the difference
        if(contains(n2,k-n.data)){
            count++;
        }
        if(n.right!=null){
            traverse(n.right,k,n2);
        }
    }
    
    //  Search difference using binary search
    private static boolean contains(Node n,int data){
        if(n.data==data){
            return true;
        }
        else if(n.data>data){
            if(n.left==null){
                return false;
            }
            else{
                return contains(n.left,data);
            }
        }
        else{
            if(n.right==null){
                return false;
            }
            else{
                return contains(n.right,data);
            }
        }

    }
    public static void main (String[] args){
        Node n=new Node(5);
        n.left=new Node(3);
        n.left.left=new Node(2);
        n.left.right=new Node(4);
        n.right=new Node(7);
        n.right.left=new Node(6);
        n.right.right=new Node(8);

        Node n1=new Node(10);
        n1.left=new Node(6);
        n1.left.left=new Node(3);
        n1.left.right=new Node(8);
        n1.right=new Node(15);
        n1.right.left=new Node(11);
        n1.right.right=new Node(18);
        System.out.println(countPairs(n,n1,16));

    }
}
