public static int getCountOfNode(Node n,int l, int h)
{
    int left=0;
    int right=0;
    if(n.left!=null&&n.data>l){
        left=getCountOfNode(n.left,l,h);
    }
    if(n.right!=null&&n.data<h){
        right=getCountOfNode(n.right,l,h);
    }
    if(n.data>=l&&n.data<=h){
        right++;
    }
    return left+right;
}
