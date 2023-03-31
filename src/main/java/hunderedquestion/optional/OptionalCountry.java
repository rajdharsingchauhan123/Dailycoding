package hunderedquestion.optional;

import java.util.Optional;

public class OptionalCountry {

    public static void main(String[] args) {
        String []countries= new String[5];

        countries[3]="india";
        Optional<String> checkCountry = Optional.ofNullable(countries[3]);
        if(checkCountry.isPresent()){
            String country = countries[3].toUpperCase();
            System.out.println(country);
        }
        System.out.println("country is null ");
    }
}
