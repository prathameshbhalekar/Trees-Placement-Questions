class Implementation {
    static List<Integer>list;
    static public void kthLargest(Node root,int k)
    {
        list=new ArrayList<>();
        //  Inorder traversal gives sorted elements
        traverse(root);
        //  return kth element frm the back
        System.out.println(list.get(list.size()-k));
    }
    static void traverse(Node n){
        if(n.left!=null){
            traverse(n.left);
        }
        list.add(n.data);
        if(n.right!=null){
            traverse(n.right);
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
        kthLargest(n,3);
    }
}
