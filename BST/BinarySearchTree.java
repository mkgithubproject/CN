public class BinarySearchTree<T extends Comparable<T>> {
    private BinaryTreeNode<T> root ;// root node of the bst
    public void insert(T x) {
        //Implement the insert() function
        root = insert(x, root);
    }
    private BinaryTreeNode<T> insert(T data , BinaryTreeNode<T> root){
        if(root == null){// if bst is empty
            BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(data);
            return newNode;
        }
        if(root.data.compareTo(data)>=0){// if bst is not empty and root data is greater than inserted data call recursive function for inserting at left
            root.left = insert(data, root.left);
        }else{
            root.right = insert(data , root.right);// else insert at right

        }
        return root ;// return root
    }

    public void delete(T x) {
        //Implement the delete() function
        root = remove(x, root);
    }
    private BinaryTreeNode<T> remove(T data , BinaryTreeNode<T> root){
        if(root == null){
            return null ;
        }
        if(data.compareTo(root.data)<0){
            root.left = remove(data, root.right);
            return root ;
        }else{
            if(root.left == null && root.right == null){
                return null;// root has zero child
            }else if(root.left == null){
                return root.right;// root has one child
            }else if(root.right == null){
                return root.left;// root has one child
            }else{// root has both child
                BinaryTreeNode<T> minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = remove(minNode.data , root.right);
                return root;
            }

        }

    }


    public void printPreOrder() {
        //Implement the printPreOrder() function
        printPreOrder(root);
    }

    private void printPreOrder(BinaryTreeNode<T> root){
        if(root == null){
            return;
        }
        // root ,left,right print order
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    public void printInOrder() {
        //Implement the printInOrder() function
        printInOrder(root);
    }

    private void printInOrder(BinaryTreeNode<T> root){
        if(root == null){
            return;
        }
      // left,root,right print order
        printInOrder(root.left);
        System.out.print(root.data+" ");
        printInOrder(root.right);

    }
    public void printPostOrder() {
        //Implement the printPostOrder() function
        printPostOrder(root);
    }

    private void printPostOrder(BinaryTreeNode<T> root){
        if(root == null){
            return;
        }
      // left right root print order
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");

    }
    public boolean  lookup(T x) {
        //Implement the lookup() function
        return lookup(x, root);
    }

    private boolean lookup(T data, BinaryTreeNode<T> root){
        if(root == null){
            return false ;
        }
        if(root.data == data){
            return true;
        }else if (data.compareTo(root.data)>0){
            return lookup(data, root.right);
        }else{
            return lookup(data , root.left);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer>bst=new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(10);
        bst.insert(15);
        bst.printPreOrder();
        System.out.println();
        bst.printInOrder();
        System.out.println();
        bst.printPostOrder();
    }

}
