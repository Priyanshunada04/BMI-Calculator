import java.util.Calendar;
import java.util.Scanner;

/****************************************************************
 * File: PriyanshuNada-Assignment-03
 * By: Priyanshu Nada
 * Date: 03-16-2023
 * Description: Program is about calculating Body Mass Index (BMI).
 * ****************************************************************/
public class BMI_Master_Version_PriyanshuNada {
    static Scanner n = new Scanner(System.in);
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("\t1 for English, Standard\n \t2 for English, Professional\n \t3 for Metric, Standard\n \t4 for Metric Professional");
        System.out.print("Please enter your choice: ");
        int ken = n.nextInt();
        switch (ken)
        {
            case 1: {

                System.out.println("-".repeat(90));
                System.out.print("--");
                System.out.println("Welcome to:");
                System.out.print("--");
                System.out.println("\t\t\tBODY MASS INDEX (BMI) Computation, English Version ");
                System.out.print("--\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t By Priyanshu Nada");
                System.out.println("-".repeat(90));


                System.out.print("Please enter your full name:");
                String name = key.nextLine();
                System.out.print("Please enter your height in feet and inches for " + name + ":");
                int feet = key.nextInt();
                int inch = key.nextInt();

                int height = ((feet * 12) + inch);


                System.out.print("Please enter your weight in pounds for " + name + ":");
                float weight = key.nextFloat();

                float calculation = (weight / (height * height)) * 703;


                System.out.print("--");
                System.out.printf("Summary report for %S", name + ":\n");
                System.out.print("--");
                System.out.print("\tBMI");
                System.out.print("\t\t\t\t\t\t" + calculation + " (or ");
                System.out.printf("%.1f if rounded) ", calculation);
                System.out.print("\n--");
                System.out.print("\tWeight Status:\t\t\t");

                if (calculation < 18.5) {
                    System.out.println("Underweight");
                } else if (calculation >= 18.5 & calculation <= 24.9) {
                    System.out.println("Healthy Weight");
                } else if (calculation >= 25.0 & calculation <= 30) {
                    System.out.println("Overweight");
                } else {
                    System.out.println("Obesity");
                }

                System.out.print("\n\nThe SFSU Mashouf Wellness Center is at 755 font blvd\n\n");
                System.out.println("-".repeat(90));
                System.out.println("-- Thank you for using my program, " + name + "!");
                System.out.println("-".repeat(90));
            }

            break;
        case 2:
        {
                final String yellow_bg = "\u001B[43m";
                final String ANSI_WHITE = "\u001B[30m";
                final String ANSI_RESET = "\u001B[0m";

                System.out.println("-".repeat(90));
                System.out.println("-- Welcome to:");
                System.out.println("--\t\t\tBody Mass Index (BMI) Computation, English Version, PRO");
                System.out.println("--\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBy: Priyanshu Nada");
                System.out.println("-".repeat(90));


                System.out.print("\nEnter your full name: ");
                String name = key.nextLine();
                System.out.print("Enter height in inches and feet for "+name+":");
                float feet = key.nextFloat();
                float inches = key.nextFloat();
                float k = (feet * 12);
                float height = k + inches;
                System.out.print("Enter Weight in pounds for "+name+": ");
                float weight = key.nextFloat();
                float calculation = (weight / (height * height)) * 703;
                float d = weight;


                System.out.printf("\n\n-- Summary Report for %S%n", name);
                System.out.print("-- Date and Time:\t\t");


                Calendar c = Calendar.getInstance();
                System.out.format("%tB %te, %tY at", c, c, c);
                System.out.format(" %tl:%tM %tp%n", c, c, c);
                System.out.printf("-- BMI:\t\t\t\t\t%.2f", calculation);
                System.out.printf(" (or %.1f if rounded)", calculation);
                String weightstatus = null;
                System.out.print("\n-- Weight Status:\t\t");
                if (calculation < 18.5) {
                    weightstatus = "Underweight";
                    System.out.println("Underweight");
                } else if (calculation < 25) {
                    weightstatus = "Healthy Weight";
                    System.out.println("Healthy Weight");
                } else if (calculation < 30) {
                    weightstatus = "Overweight";
                    System.out.println("Overweight");
                } else {
                    weightstatus = "Obesity";
                    System.out.println("Obesity");
                }

                System.out.print("\n\nPlease enter the LOW weight in pound for "+name+":");
                float a = key.nextFloat();
                System.out.print("Please enter the HIGH weight in pound for "+ name+":");
                float b = key.nextFloat();
                System.out.print("\n\n");
                System.out.println("-".repeat(61));
                System.out.println("| Weight\t\t| BMI\t\t\t| Weight Status\t\t\t\t|");
                System.out.println("-".repeat(61));
                float i;
                for (i = a; i <= b; i += 5.5) {

                    float bmi = (i / (height * height)) * 703;


                    if (bmi < 18.5) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.2f", bmi);
                        System.out.print("\t\t\t| ");
                        System.out.print("Underweight");


                    } else if (bmi < 25) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.3f", bmi);
                        System.out.print("\t\t\t| ");
                        System.out.print("HealthyWeight");


                    } else if (bmi < 30) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.4f", bmi);
                        System.out.print("\t\t| ");
                        System.out.print("Overweight");


                    } else {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.5f", bmi);
                        System.out.print("\t\t| ");
                        System.out.print("Obesity\t");


                    }


                    if (i == a) {
                        System.out.print("\t\t" + yellow_bg + ANSI_WHITE + "(Low)" + ANSI_RESET);
                        System.out.println("\t|");
                    } else {

                        System.out.println("\t\t\t\t|");
                    }

                    if (i + 5.5 > d && i < d) {
                        if (weightstatus == "Underweight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.2f", calculation);
                            System.out.print("\t\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else if (weightstatus == "Healthy Weight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.3f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else if (weightstatus == "Overweight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.4f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else {

                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.5f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t\t|");
                        }
                    }

                }
                float j = (b / (height * height)) * 703;
                System.out.print("| " +b+"\t\t|"+j+"\t\t| obesity\t\t\t");
                System.out.print(yellow_bg + ANSI_WHITE + "(High)" + ANSI_RESET);
                System.out.println("\t|");
                System.out.println("-".repeat(61));
                System.out.print("\n\nThe SFSU Mashouf Wellness Center is at 755 Font Blvd.\n\n");
                System.out.println("-".repeat(90));
                System.out.println("-- Thank you for using my program " + name);
                System.out.println("-- Priyanshu!!!");
                System.out.println("-".repeat(90));

            }
            break;
            case 3:
            {
                System.out.println("-".repeat(90));
                System.out.print("--");
                System.out.println("Welcome to:");
                System.out.print("--");
                System.out.println("\t\t\tBODY MASS INDEX (BMI) Computation, Metric Version ");
                System.out.print("--\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\tBy Priyanshu Nada");
                System.out.println("-".repeat(90));


                System.out.print("Please enter your full name:");
                String name = key.nextLine();
                System.out.print("Please enter your height in centimeters for " + name+":");
                float  h = key.nextFloat();
                // converting height in cm to meter
                float height = h/100;



                System.out.print("Please enter your weight in kilogram for "+ name+":");
                float weight = key.nextFloat();

                float calculation = (weight/(height*height));


                System.out.print("--");
                System.out.printf("Summary report for %S", name+":");
                System.out.print("\n--");
                System.out.print("\tBMI");
                System.out.print("\t\t\t\t\t\t"+calculation+ " (or ");
                System.out.printf("%.1f if rounded) ",calculation);
                System.out.print("\n--");
                System.out.print("\tWeight Status:\t\t\t");

                if(calculation < 18.5)
                {
                    System.out.println("Underweight");
                }
                else if (calculation>= 18.5 & calculation<= 24.9)
                {
                    System.out.println("Healthy Weight");
                }
                else if (calculation>= 25.0 & calculation<= 29.9)
                {
                    System.out.println("Overweight");
                }
                else
                {
                    System.out.println("Obesity");
                }

                System.out.print("\n\nThe SFSU Mashouf Wellness Center is at 755 font blvd\n\n");
                System.out.println("-".repeat(90));
                System.out.println("-- Thank you for using my program, "+name+"!");
                System.out.println("-".repeat(90));

            }
            break;
            case 4:
            {
                final String yellow_bg = "\u001B[43m";
                final String ANSI_WHITE = "\u001B[30m";
                final String ANSI_RESET = "\u001B[0m";

                System.out.println("-".repeat(90));
                System.out.println("-- Welcome to:");
                System.out.println("--\t\t\tBody Mass Index (BMI) Computation, Metric Version, PRO");
                System.out.println("--\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBy: Priyanshu Nada");
                System.out.println("-".repeat(90));


                System.out.print("\nEnter your full name: ");
                String name = key.nextLine();
                System.out.print("Enter height in centimetre for "+name+":");
                float h = key.nextFloat();
                float height = h/100;
                System.out.print("Enter Weight in kilogram for "+name+": ");
                float weight = key.nextFloat();
                float calculation = (weight /(height * height));
                float d = weight;


                System.out.printf("\n\n-- Summary Report for %S%n", name);
                System.out.print("-- Date and Time:\t\t");


                Calendar c = Calendar.getInstance();
                System.out.format("%tB %te, %tY at", c, c, c);
                System.out.format(" %tl:%tM %tp%n", c, c, c);
                System.out.printf("-- BMI:\t\t\t\t\t%.6f", calculation);
                System.out.printf(" (or %.1f if rounded)", calculation);
                String weightstatus = null;
                System.out.print("\n-- Weight Status:\t\t");
                if (calculation < 18.5) {
                    weightstatus = "Underweight";
                    System.out.println("Underweight");
                } else if (calculation < 25) {
                    weightstatus = "Healthy Weight";
                    System.out.println("Healthy Weight");
                } else if (calculation < 30) {
                    weightstatus = "Overweight";
                    System.out.println("Overweight");
                } else {
                    weightstatus = "Obesity";
                    System.out.println("Obesity");
                }

                System.out.print("\n\nPlease enter the LOW weight in kilogram for "+name+":");
                float a = key.nextFloat();
                System.out.print("Please enter the HIGH weight in kilogram for "+ name+":");
                float b = key.nextFloat();
                System.out.print("\n\n");
                System.out.println("-".repeat(61));
                System.out.println("| Weight\t\t| BMI\t\t\t| Weight Status\t\t\t\t|");
                System.out.println("-".repeat(61));
                float i;
                for (i = a; i <= b; i += 2.5) {

                    float bmi = (i / (height * height));


                    if (bmi < 18.5) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.2f", bmi);
                        System.out.print("\t\t\t| ");
                        System.out.print("Underweight");


                    } else if (bmi < 25) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.3f", bmi);
                        System.out.print("\t\t\t| ");
                        System.out.print("HealthyWeight");


                    } else if (bmi < 30) {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.4f", bmi);
                        System.out.print("\t\t| ");
                        System.out.print("Overweight");


                    } else {
                        System.out.printf("| %.2f  \t\t", i);
                        System.out.printf("|%.5f", bmi);
                        System.out.print("\t\t| ");
                        System.out.print("Obesity\t");


                    }


                    if (i == a) {
                        System.out.print("\t\t" + yellow_bg + ANSI_WHITE + "(Low)" + ANSI_RESET);
                        System.out.println("\t|");
                    } else {

                        System.out.println("\t\t\t\t|");
                    }

                    if (i + 2.5 > d && i < d) {
                        if (weightstatus == "Underweight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.2f", calculation);
                            System.out.print("\t\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else if (weightstatus == "Healthy Weight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.3f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else if (weightstatus == "Overweight") {
                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.4f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t|");
                        } else {

                            System.out.printf("| %.2f  \t\t", weight);
                            System.out.printf("|%.5f", calculation);
                            System.out.print("\t\t| " + weightstatus);
                            System.out.print("\t");
                            System.out.println("  This\t\t\t|");
                        }
                    }

                }
                float j = (b/(height * height));
                System.out.print("| " +b+"\t\t\t|"+j+"\t\t| obesity\t\t\t");
                System.out.print(yellow_bg + ANSI_WHITE + "(High)" + ANSI_RESET);
                System.out.println("\t|");
                System.out.println("-".repeat(61));
                System.out.print("\n\nThe SFSU Mashouf Wellness Center is at 755 Font Blvd.\n\n");
                System.out.println("-".repeat(90));
                System.out.println("-- Thank you for using my program " + name);
                System.out.println("-- Priyanshu!!!");
                System.out.println("-".repeat(90));
            }
            break;
        }
    }

}



