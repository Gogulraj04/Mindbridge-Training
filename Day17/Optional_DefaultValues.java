package Day17;

import java.util.Optional;

public class Optional_DefaultValues {
    public static void main(String[] args) {
        String input=null;
        Optional<String> optional=Optional.ofNullable(input);
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(input);
        }else {
            input=optional.orElse("Guest");
            System.out.println(input);
        }
    }
}
