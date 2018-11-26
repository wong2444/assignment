package week5;

public class GuessingGame {
    public static void main(String[] args) {
        int num = 0;
        int guessNum = 0;
//        BinarySearchTree tree = new BinarySearchTree();

        num = (int) Math.floor(Math.random() * (2000 - 1 + 1)) + 1;// gen num between 1 to 2000
        guessNum = (int) Math.floor(Math.random() * (2000 - 1 + 1)) + 1;
        int min = 1;//
        int max = 2000;
        while (guessNum != num) {
            System.out.println("guessNum: " + guessNum);
            System.out.println("Num: " + num);
            if (guessNum < num) {
                System.out.println("higher");
                min = guessNum + 1;//
                guessNum = (int) Math.floor(Math.random() * (max - min + 1)) + 1;//binary search higher num
            } else if (guessNum > num) {
                System.out.println("lower");
                max = guessNum - 1;//binary search lower num
                guessNum = (int) Math.floor(Math.random() * (max - min + 1)) + 1;
            }
        }
        System.out.println("you guess: " + guessNum);
        System.out.println("answer: " + num);


    }


}
