package org.function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class MySupplier implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
public class SupplierDemo {
    public static void main(String[] args) {
        //Traditional way
        Supplier<LocalDateTime> timeSupplier = new MySupplier();
        System.out.println(timeSupplier.get());

        //Lambda exp
        Supplier<LocalDateTime> timeSupplier1 = ()->{
            return LocalDateTime.now();
        };
        System.out.println(timeSupplier1.get());
    }

}
