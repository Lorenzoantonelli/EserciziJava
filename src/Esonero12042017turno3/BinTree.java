package Esonero12042017turno3;

public interface BinTree {

    int root ();
    // restituisce l'intero che etichetta la radice di this

    BinTree leftChild ();
    // restituisce il figlio sinistro

    BinTree rightChild ();
    // restituisce il figlio destro

    void intersect (BinTree t) throws Exception;
    /*
    taglia i rami di this lasciandone solo l'intersezione con t,
    ovvero quanto, partendo dalla radice, è "sovrapponibile"
    (isomorfo) a t. Lancia l'eccezione se l'intersezione è vuota.
    */
}
