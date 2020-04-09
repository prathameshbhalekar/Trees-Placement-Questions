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
        node(){
            left=null;
            right=null;
        }
    }

    class tree{
        node root;
        void post(node n){
            if(n.left!=null){
                post(n.left);
            }if(n.right!=null){
                post(n.right);
            }
            System.out.print(n.data+" ");
        }
        void makeTree(ArrayList<Integer>pre,int[]ino,int size){
            root=new node();
            makeNode(root,ino,pre);
        }
        void makeNode(node n,int[]array,ArrayList<Integer>pre){
            if(array.length==1){
                n.data=array[0];
            }
            else{
                int min=99999;
                int posOf=9999;
                for(int i=0;i<array.length;i++){
                    int pos=pre.indexOf(array[i]);
                    if(pos<min){
                        posOf=i;
                        min=pos;
                    }
                }
                n.data=array[posOf];
                int []left=new int[posOf];
                int []right=new int[array.length-posOf-1];
                int count=0;
                for(int i=0;i<array.length;i++) {
                    if (i == posOf) {
                        count = 0;
                        continue;
                    }
                    if (i < posOf) {
                        left[count] = array[i];
                        count++;
                    }
                    if (i > posOf) {
                        right[count] = array[i];
                        count++;
                    }
                }
                    if (left.length != 0) {
                        n.left = new node();
                        makeNode(n.left, left, pre);
                    }
                    if (right.length != 0) {
                        n.right = new node();
                        makeNode(n.right, right, pre);
                    }


            }
        }
    }


    public class Implementation {
        public static void main(String []args){
            int[]ino={3,1,4,0,5,2,6};
            ArrayList<Integer> list=new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(2);
            list.add(5);
            list.add(6);
            tree t=new tree();
            t.makeTree(list,ino,ino.length);
            t.post(t.root);

        }
    }
