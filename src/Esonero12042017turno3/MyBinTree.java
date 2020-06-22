package Esonero12042017turno3;

public class MyBinTree implements BinTree{

    private int root;
    private BinTree left;
    private BinTree right;

    public MyBinTree(int root){
        this.root=root;
    }

    public MyBinTree(int root,BinTree left,BinTree right){
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
    public void intersect(BinTree t) throws Exception {
        //Caso base
        if (this.left==null || t.leftChild()==null) {
            this.left=null;
            this.right=null;
        }
        else if (this.left.root()!=t.leftChild().root()) {
            this.left=null;
            this.right=null;
        }
        if (this.right==null || t.rightChild()==null) {
            this.right=null;
            this.left=null;
        }
        else if (this.right.root()!=t.rightChild().root()) {
            this.right=null;
            this.left=null;
        }
        //Caso ricorsivo
        if (this.left!=null) this.left.intersect(t.leftChild());
        if (this.right!=null) this.right.intersect(t.rightChild());

    }

    public static void main(String[] args) throws Exception {
        BinTree nodo7=new MyBinTree(7);
        BinTree nodo6=new MyBinTree(6);
        BinTree nodo5=new MyBinTree(5);
        BinTree nodo4=new MyBinTree(4);
        BinTree nodo3=new MyBinTree(3,nodo4,nodo5);
        BinTree nodo2=new MyBinTree(2,nodo3,nodo6);
        BinTree root=new MyBinTree(1,nodo2,nodo7);

        BinTree nodot8=new MyBinTree(8,new MyBinTree(4),new MyBinTree(5));
        BinTree nodot7=new MyBinTree(7,new MyBinTree(9),new MyBinTree(10));
        BinTree nodot6=new MyBinTree(6);
        BinTree nodot2=new MyBinTree(2,nodot8,nodot6);
        BinTree rootT=new MyBinTree(1,nodot2,nodot7);

        root.intersect(rootT);
    }
}
