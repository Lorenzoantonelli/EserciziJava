package Esonero12042017turno2;

public interface BinTree {

    int root ();
    // restituisce l'intero che etichetta la radice di this

    BinTree leftChild ();
    // restituisce il figlio sinistro

    BinTree rightChild ();
    // restituisce il figlio destro

    void times (BinTree t);
    // sostituisce ogni foglia di this con t
}

