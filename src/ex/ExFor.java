package ex;

public class ExFor {

    //配列の合計
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("合計:" + sum);
        System.out.println("平均:" + (double) sum / array.length);
    }
}
