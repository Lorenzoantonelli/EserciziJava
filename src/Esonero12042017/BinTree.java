package Esonero12042017;

public interface BinTree {

    int root ();
    // restituisce l'intero che etichetta la radice di this

    BinTree leftChild ();
    // restituisce il figlio sinistro

    BinTree rightChild ();
    // restituisce il figlio destro

    void flip ();
    // trasforma this nella sua versione speculare
}