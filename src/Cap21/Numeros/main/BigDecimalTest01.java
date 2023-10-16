package Cap21.Numeros.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");
        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN);
        //BigDecimal z = x.divide(y, 4, RoundingMode.UP);
        //BigDecimal z= x.divide(y, 4, RoundingMode.DOWN);



        System.out.println(z);

    }


}
