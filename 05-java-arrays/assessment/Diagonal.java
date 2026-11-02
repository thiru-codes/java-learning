public class Diagonal {
    public static void main(String[] args) {
        int n=3;
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        //print array
        System.out.println("Array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //primary diagonal
        System.out.print("Primary diagonal: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        

        //secondary diagonal
        System.out.print("Secondary diagonal: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i][n-i-1] + " ");
        }
        System.out.println();
    }
}
