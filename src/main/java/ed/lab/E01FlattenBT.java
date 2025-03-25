package ed.lab;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        //indicando los subárboles izquierdos y derechos
        TreeNode<Integer> leftSubtree = root.left;
        TreeNode<Integer> rightSubtree = root.right;

        //cambia el subárbol izquierdo hacia el derecho
        root.left = null;
        root.right = leftSubtree;

        //nodo
        TreeNode<Integer> Nodoactual = root;
        while (Nodoactual.right != null) {
            Nodoactual = Nodoactual.right;
        }
        Nodoactual.right = rightSubtree;
    }

}
