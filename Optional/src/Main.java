import java.util.Scanner;

public class Main {

    public static int validate() {
        int num = 0;
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Must be an integer");
            System.exit(1);
        }
        return num;
    }

    public static void dfs(int node, int[] visited, int length, int[][] matrix) {
        visited[node] = 1;
        for (int i = 0; i < length; i++)
            if (visited[i] == 0 && matrix[node][i] == 1) {
                dfs(i, visited, length, matrix);
            }

    }

    public static void connected(int[][] matrix, int length) {
        int[] visited = new int[length];
        int contorization = 0;
        for (int i = 0; i < length; i++) {
            if (visited[i] == 0) {
                contorization++;
                dfs(i, visited, length, matrix);

            }
        }
        if (contorization == 1)
            System.out.println("Connected");
    }

    public static void print(int[][] matrix, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = validate();
        StringBuilder str = new StringBuilder();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                if (i == j)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = matrix[j][i] = Math.random() < 0.5 ? 0 : 1;
            }
        
        print(matrix, n);
        connected(matrix, n);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.print(totalTime);
    }
}
