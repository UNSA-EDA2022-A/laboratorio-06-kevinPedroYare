package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


        public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2) {
        if (a1.isEmpty() && a2.isEmpty())
            return true;
        else if (a1.isEmpty() || a2.isEmpty())
            return false;
        else {
            if (a1.root.data.compareTo(a2.root.data) == 0)
                return bstSimilares(a1.root.left, a2.root.left) && bstSimilares(a1.root.right, a2.root.right);
            else
                return false;
        }
    }

    private <T extends Comparable<T>> boolean bstSimilares(Node<T> nodo, Node<T> nodo2) {
        if (nodo == null && nodo2 == null)
            return true;
        else if (nodo == null || nodo2 == null)
            return false;
        else {
            if (nodo.data.compareTo(nodo2.data) == 0)
                return bstSimilares(nodo.left, nodo2.left) && bstSimilares(nodo.right, nodo2.right);
            else
                return false;
        }
    }
}
