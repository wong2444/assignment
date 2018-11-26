package week2;

public abstract class GenLib {

    public static int getInt(int start, int end) {

        int num = start + (int) (Math.random() * (end - start + 1));//生成 “start <= 随机数 <= end ” 的随机数
        return num;
    }

    public static void main(String args[]) {
        int num = GenLib.getInt(10, 20);
        System.out.println(num);
    }
}



