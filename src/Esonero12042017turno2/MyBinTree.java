package Esonero12042017turno2;

public class MyBinTree implements BinTree {

    private int root;
    private BinTree left;
    private BinTree right;

    public MyBinTree(int root){
        this.root=root;
    }

    public MyBinTree(int root, BinTree left, BinTree right){
        this.root=root;
        this.left=left;
        this.right=right;
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
    public void times(BinTree t) {
        if (left!=null){
            left.times(t);
            if (left.leftChild()==null && left.rightChild()==null) left=t;
        }
        if (right!=null){
            right.times(t);
            if (right.leftChild()==null && right.rightChild()==null) right=t;
        }
    }

    public static void main(String[] args) {
        BinTree t0=new MyBinTree(1,new MyBinTree(2),new MyBinTree(3));
        BinTree t=new MyBinTree(4,new MyBinTree(5),new MyBinTree(6));
        t0.times(t);
    }
}
