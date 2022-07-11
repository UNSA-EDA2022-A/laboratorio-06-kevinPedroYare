package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
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
