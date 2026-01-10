package Java8;

import javax.xml.transform.Source;
import java.util.function.Supplier;

public class SupplierDemo {
    //Supplier is a functionalInterface which doesn't accept anything,
    //but it returns 'something of type of supplier' like below

    public void testSupplier(){

        Supplier<Double> random = () -> Math.random();
        Supplier<Double> randomNum = Math::random;

        System.out.println(random.get());
        System.out.println(randomNum.get());
    }

    //supplier could be used in test automation framework as driver get class

}
