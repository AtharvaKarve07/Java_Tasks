import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTaxCalculation {
    public static void main(String[] args) {
        BigDecimal netPrice = new BigDecimal("9.99");

        BigDecimal vatRate = new BigDecimal("0.23");

        BigDecimal grossPrice = netPrice.multiply(BigDecimal.ONE.add(vatRate))
                .setScale(2, RoundingMode.HALF_UP); 

        BigDecimal totalGross = grossPrice.multiply(new BigDecimal("10000"));

        BigDecimal totalNet = totalGross.divide(BigDecimal.ONE.add(vatRate), 2, RoundingMode.HALF_UP);

        System.out.println("Gross price of one item: " + grossPrice);
        System.out.println("Total gross value for 10,000 items: " + totalGross);
        System.out.println("Total net value after excluding VAT: " + totalNet);
    }
}
