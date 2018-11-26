package week5;

public class Iterative {
    static public int Search(int num) {
        int left = 1, right = 2000;
        while (left <= right) {
            int middle = (right + left) / 2; //binary search


            if (middle == num) {
                return middle;
            }


            if (middle > num) {
                right = middle - 1;
                System.out.println(middle);
                System.out.println("lower");
            } else {
                left = middle + 1;
                System.out.println(middle);
                System.out.println("higher");
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num = (int) Math.floor(Math.random() * (2000 - 1 + 1)) + 1;// gen num between 1 to 2000
        System.out.println("num: " + num);
        int answer = Search(num);
        System.out.println("answer: " + answer);
    }
}
