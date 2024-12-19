import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the matrix dimensions");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int [][] matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("["+(i+1)+"]"+" ["+(j+1)+"]");
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("reflexive = "+reflexive(matrix));
        System.out.println("symmetric = "+symmetric(matrix));
        System.out.println("transitive = "+transitive(matrix));
    }
    public static boolean reflexive(int [][] matrix){
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1){
                count++;
            }
        }
        if (count == matrix.length){
            flag = true;
        }
        return flag;
    }
    public static boolean symmetric(int [][] matrix){
        boolean flag = true;
        int a = matrix.length;
        int b = matrix[0].length;
        int [][] spare = new int[a][b];
        for (int i = 0; i < spare.length; i++) {
            System.arraycopy(matrix[i], 0, spare[i], 0, spare.length);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(spare[i][j] != matrix[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public static boolean transitive(int [][] matrix){
        boolean flag = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (i != j && j != k && k != i){
                        if (matrix[i][j] == 1 && matrix[j][k] == 1 && matrix[i][k] == 1){
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }
    public static boolean acyclic(int [][] matrix){
        boolean flag = false;


        return flag;
    }

}