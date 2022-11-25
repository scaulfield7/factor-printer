package projects.learning;

public class FactorPrinter{
    public static void printAllFactors(int number){
        int factor = 1;
        if(number < 1){
            System.out.println("Invalid number");
        }else{
            while(factor <= number){
                if(number % factor == 0){
                    System.out.println(factor);
                }
                factor++;
            }
        }
    }
}