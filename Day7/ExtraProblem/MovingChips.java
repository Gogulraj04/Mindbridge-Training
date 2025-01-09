package ExtraProblem;

public class MovingChips {
    static int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i=0;i<position.length;i++){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return (int)(Math.min(odd,even));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(minCostToMoveChips(arr));
    }
}
