package learn.java;

public class J_10MultiD {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3, 4, 5},
                {9, 4, 5, 6, 3},
                {6, 3, 4, 6, 7},
        };

        System.out.println(arr1.length);
        for (int i=0; i<arr1.length; i++ ){
            for (int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println(" ");
        }
    }
}
