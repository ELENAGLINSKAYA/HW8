import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2 ");

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        System.out.println(Arrays.toString(number));

        double[] Number = {1.57, 7.654, 9.986};
        Number[0] = 1.57;
        Number[1] = 7.654;
        Number[2] = 9.986;
        System.out.println(Arrays.toString(Number));
        int[] apple = new int[8];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        apple[3] = 4;
        apple[4] = 5;
        apple[5] = 6;
        apple[6] = 7;
        apple[7] = 8;
        System.out.println(Arrays.toString(apple));
        System.out.println("Задача 4");

        int[] numbers = {1, 2, 3};

        for (int i = 0; i < 3; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println(numbers[i] + 1 + "");

            }
        }

        System.out.println("Задача 3");

        int[] figure = {1, 2, 3};
        for (int n = figure.length - 1; n >= 0; n--) {
            System.out.print(figure[n] + " , ");

        }
        System.out.println();

        double[] Figure = {1.57, 7.654, 9.986};
        for (int m = Figure.length - 1; m >= 0; m--)
            System.out.print(Figure[m] + " , ");

        System.out.println();

        int []Apple ={1,2,3,4,5,6,7,8};
        for (int l =Apple.length-1;l >=0;l--){
            System.out.print(Apple[l]+" , ");

        }}}