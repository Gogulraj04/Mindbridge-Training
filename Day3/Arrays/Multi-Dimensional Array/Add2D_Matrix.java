package Day3;

public class Add2D_Matrix {
    static int add_2dMatrix(int[][] arr1,int[][] arr2){
        int sum=0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr1[0].length;j++){
                sum+=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{9,8,7},{6,5,4},{3,2,1}};
        System.out.println(add_2dMatrix(arr1,arr2));
    }
}
