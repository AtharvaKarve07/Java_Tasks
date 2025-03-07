class MarsWeightCalculator {
    public static void main(String[] args) {
        float earthweight; 
        float marsweightakhil; 
        earthweight = 80.0f; 
        marsweightakhil = earthweight * 0.38f; 
        double marsweightdouble = marsweightakhil; 
        System.out.printf("Mars weight in double: %.4f\n", marsweightdouble); 
        int marsWeightInt = (int) marsweightdouble; 
        char marsWeightChar = (char) marsWeightInt; 
        int modifiedWeight = marsWeightChar + 1;
        System.out.println("Earth Weight : " + earthweight);
        System.out.println("Mars Weight : " + marsweightakhil);
        System.out.printf("Mars Weight : %.4f\n", marsweightdouble);
        System.out.println("Mars Weight : " + marsWeightInt);
        System.out.println("Mars Weight (char - ASCII): " + marsWeightChar);
        System.out.println("Modified Char to Int: " + modifiedWeight);


    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello everyone");
        System.out.printf("Hello Vistula!%n");
        System.out.println("Program executed succesfully.");
    }
}
