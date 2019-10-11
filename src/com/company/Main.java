package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private  static int[][] matrix;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество строк: ");
            int n = scanner.nextInt();
            System.out.println("Введите количество столбцов: ");
            int m = scanner.nextInt();

            creatMatrix(n, m);
        } catch (InputMismatchException ex)
        {
            System.out.println("Ошибка ввода");
        }
    }
    static void creatMatrix(int n, int m)
    {
        matrix = new int[n][m];
        int k = 0;
        System.out.println("Ваша матрица: " );
        for (int i = 0; i < n; i++) {
            // цикл по второй размерности
            for (int j = 0; j < m; j++) {
                //инициализация элементов массива

                if (k < n) {
                    matrix[i][j] = 1;
                    k++;
                }
                else {
                    matrix[i][j] = 0;
                }
                //вывод элементов массива
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
