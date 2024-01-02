package org.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = "abc@gmail.com";

        //This method creates an empty Optional instance:
        Optional<String> emptyOptional = Optional.empty();

        //Creates an Optional instance containing the specified non-null value.
        // If the provided value is null, it throws a NullPointerException
        Optional<String> ofOptional = Optional.of(email);

        //Creates an Optional instance that contains the specified value if it's non-null,
        // or an empty Optional if the value is null.
        Optional<String> ofNullableOptional = Optional.ofNullable(email);

        if(ofNullableOptional.isPresent()){
            System.out.println(ofNullableOptional.get());
        }
        String defaultOptional = ofNullableOptional.orElse("default@gmqil.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = ofNullableOptional.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

        String throwOptional = ofNullableOptional.orElseThrow(()->new IllegalArgumentException("email not present"));
        System.out.println(throwOptional);

        Optional<String> gender = Optional.of("MALE");
        gender.ifPresent((gen)-> System.out.println(gender.get()));

        Optional<String> stringOptional = Optional.of("abc");
        stringOptional.filter((ip)->ip.contains("abc")).ifPresent((ip)-> System.out.println(ip));

        stringOptional.filter((ip)->ip.contains("abc")).map(ip->ip.toUpperCase()).ifPresent((ip)-> System.out.println(ip));

    }
}
