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

    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        if(a.isEmpty()){
            return true;
        }else{
            if(a.root.left == null && a.root.right == null){
                return true;
            }else{
                if(a.root.right == null){
                    return bstEstrictamenteBinario(a.root.left);
                }else{
                    return bstEstrictamenteBinario(a.root.left) && bstEstrictamenteBinario(a.root.right);
                }
            }
        }
    }
    public <T> boolean bstEstrictamenteBinario(Node<T> nodo){
        if(nodo == null){
            return true;
        }
        else{
            if(nodo.left == null && nodo.right != null){
                return false;
            }
            else if(nodo.left != null && nodo.right == null){
                return false;
            }
            else{
                return bstEstrictamenteBinario(nodo.left) && bstEstrictamenteBinario(nodo.right);
            }
        }
    }
}
