package week5;

public class BSTTest {
    public static void main(String[] args) {
        int data = 0;
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = {2, 7, 9, 4, 1, 5, 3, 6, 0, 8};
        System.out.println("Inserting :");
        for (int k = 1; k <= 10; k++) {
//            data = (int) (Math.random() * 100);
            data = arr[k - 1];
            System.out.print(data + " ");
            tree.insert(data);
        }
        System.out.println();
        System.out.println("inorder sort");
        tree.inorder();
        tree.delete(data); // delete the last inserted
        System.out.println("after delete");
        tree.inorder();
    }


}
