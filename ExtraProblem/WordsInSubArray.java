package ExtraProblem;

public class WordsInSubArray {
    static int count(String[] arr,String word){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(word.contains(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns={"a","abc","bc","d"};
        String word = "abc";
        System.out.println(count(patterns,word));

    }
}
