package SomeBasic;

public class Array {
    public static void main(String[] args) {
        int [] age = {20, 30, 50, 70};
        int n = Math.floorDiv(age.length,2);
        int temp;

        for (int i=0; i<n; i++) {
            temp = age[i];
            age[i] = age[age.length - i - 1];
            age[age.length - i - 1] = temp;
        }
        for (int element:age){
            System.out.print(element + " ");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int e:age){
            if (e>max){
                max = e;
            }
        }
        System.out.print("Max: " + max);

        for (int i=age.length - 1; i>=0; i--) {
            System.out.println(age[i]);
        }
        for (int element: age) {
            System.out.println(element);
        }

        int[][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int[] elem : flats) {
            for (int i : elem) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        int[] a = {10,20,30,40,50};
        int sum = 0;
        for (int ele:a){
            sum = sum + ele;
        }
        System.out.println(sum);

        int[][] mat1 = {{1,2,3}, {4,5,6}};
        int[][] mat2 = {{7,8,9}, {10,11,12}};
        int[][] sum1 = {{0,0,0}, {0,0,0}};
        for (int i=0; i<mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                sum1[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf(sum1[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[] z = {1,2,3,4,6,7};
        boolean sort = true;
        for (int j=0; j<z.length-1; j++){
            if (z[j]>z[j+1]){
                sort = false;
                break;
            }
        }
        if (sort){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
