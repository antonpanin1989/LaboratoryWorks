package Modul1;

/**
 * Created by Anton on 14.01.2017.
 */
public class Lab1_6_5 {
    public static void main(String[] args) {
        int[][] mas = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] add = new int[4][4];
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                System.out.print(mas[y][i] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                if (mas[i][y] == mas[3][y] || mas[i][y] == mas[2][y] || mas[i][y] == mas[1][y] || mas[i][y] == mas[0][y]) {
                    add[0][y] = mas[3][y];
                    add[1][y] = mas[2][y];
                    add[2][y] = mas[1][y];
                    add[3][y] = mas[0][y];
                    System.out.print(add[y][i] + " ");
                }
            }
            System.out.println();
        }
    }
}