package E_13;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class CalculateInterest {
    Scanner reader = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("###.##");
    float principle,interest,numyears,compounds,interestholder;


    public void getValues(){
        System.out.print("Enter the the principle: ");
        principle = reader.nextFloat();
        System.out.print("Enter the Interest rate as a whole number:" );
        interestholder = reader.nextFloat();
        interest = interestholder/100;
        System.out.print("Enter the number of years: ");
        numyears = reader.nextFloat();
        System.out.print("How many times does the interest compound per year: ");
        compounds = reader.nextFloat();
    }

    public void calcInterest() {
        float total = (1 + interest/compounds);
        total = (float) Math.pow(total,compounds*numyears);
        total *= principle;
        total = Float.parseFloat(formatter.format(total));
        System.out.printf("After %.0f years at  %.1f%% interest compounding %.0f times a year, the investment will be worth $%.2f", numyears,interestholder,compounds,total);
    }

}
