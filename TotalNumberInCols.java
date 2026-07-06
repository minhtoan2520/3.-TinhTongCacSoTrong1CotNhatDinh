import java.util.Scanner;

//BT Tinh tong cac so trong 1 cot nhat dinh
public class TotalNumberInCols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so hang cua mang: ");
        int rows = input.nextInt();

        System.out.print("Nhap so cot cua mang: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Nhap so cot ban muon tinh tong: ");
        int colIndex = input.nextInt();
        while (colIndex < 0 || colIndex > cols) {
            System.out.print("Cot muon tinh ngoai pham vi! \nVui long nhap lai: ");
            colIndex = input.nextInt();
        }
        int total = 0;
        for (int i = 0; i < rows; i++) {
            total += matrix[i][colIndex];
        }
        System.out.print("Tong cac so trong cot " + colIndex + " la: " + total);
        input.close();
    }

}