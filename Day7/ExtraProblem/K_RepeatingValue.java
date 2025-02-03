package ExtraProblem;

public class K_RepeatingValue {
    static int subString(String sequence,String word){
        int len=word.length();
        int count=0;
        for(int i=0;i<=sequence.length()-len;i++){
            String dummy=sequence.substring(i,i+len);
            if(dummy.equals(word)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String sequence = "ababc", word = "aba";
        System.out.println(subString(sequence,word));

    }
}
