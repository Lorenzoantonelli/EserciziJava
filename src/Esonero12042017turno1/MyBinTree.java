package Esonero12042017turno1;

public class MyBinTree implements BinTree {

    private int root;
    private BinTree left;
    private BinTree right;

    public MyBinTree(int root, BinTree left, BinTree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }

    public MyBinTree(int root){
        this.root=root;
    }

    @Override
    public int root() {
        return root;
    }

    @Override
    public BinTree leftChild() {
        return left;
    }

    @Override
    public BinTree rightChild() {
        return right;
    }

    @Override
    public void flip() {
        BinTree temp=left;
        left=right;
        right=temp;
        if (left!=null) left.flip();
        if (right!=null) right.flip();
    }

    public static void main(String[] args) {
        BinTree sx=new MyBinTree(2);
        BinTree dx=new MyBinTree(3,new MyBinTree(4),new MyBinTree(5));
        BinTree root=new MyBinTree(1,sx,dx);

        root.flip();
        System.out.println();
    }

}
