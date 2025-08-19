import java.util.Scanner;
class salaryinfo{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("--------------------------------------------------------------------------");
System.out.println("|                     SALARY INFORMATION SYSTEM                          |");
System.out.println("--------------------------------------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println("        [1] Calculate Income Tax");
System.out.println("        [2] Calculate Annual Bonus");
System.out.println("        [3] Calculate Loan amount");
System.out.println("");
System.out.print(" Enter an Option to continue : ");
int opt= input.nextInt();

if (opt == 1){
System.out.println("--------------------------------------------------------------------------");
System.out.println("|                    Calculate Income Tax                                |");
System.out.println("--------------------------------------------------------------------------");
System.out.println("");
System.out.println("");

System.out.print(" Input Employee Name : ");
String name = input.next();

System.out.print(" Input Employee salary : ");
double salary= input.nextDouble();

System.out.println("");

if (salary<=100000){
System.out.println("No tax");
}else if(salary <= 144667){
double tax = salary*0.06;
System.out.println("You have to pay Income Tax per month : " + tax);
}else if(salary <= 183333){
double tax = salary*0.12;
System.out.println("You have to pay Income Tax per month : " + tax);
}else if(salary <= 225000){
double tax = salary*0.18;
System.out.println("You have to pay Income Tax per month : " + tax);
}else if(salary <= 266667){
double tax = salary*0.24;
System.out.println("You have to pay Income Tax per month : " + tax);
}else if(salary <= 308333){
double tax = salary*0.30;
System.out.println("You have to pay Income Tax per month : " + tax);
}else{
double tax = salary*0.36;
System.out.println("You have to pay Income Tax per month : " + tax);

} 
}

else if ( opt==2){
System.out.println("--------------------------------------------------------------------------");
System.out.println("|                    Calculate Annual Bonus                              |");
System.out.println("--------------------------------------------------------------------------");
System.out.println("");
System.out.println("");

System.out.print(" Input Employee Name : ");
String name = input.next();

System.out.print(" Input Employee salary : ");
double salary= input.nextDouble();

System.out.println("");

if(salary <=100000){
System.out.println("Annual Bonus : 5000" );
}else if(salary<=199999){
double bonus= salary *0.10;
System.out.println("Annual Bonus :"+bonus);
}else if(salary<=299999){
double bonus= salary *0.15;
System.out.println("Annual Bonus :"+bonus);
}else if(salary<=399999){
double bonus= salary *0.20;
System.out.println("Annual Bonus :"+bonus);
}else{
double bonus= salary *0.10;
System.out.println("Annual Bonus :"+bonus);

}
} 

else if ( opt==3){
System.out.println("--------------------------------------------------------------------------");
System.out.println("|                    Calculate Loan Amount                               |");
System.out.println("--------------------------------------------------------------------------");
System.out.println("");
System.out.println("");

System.out.print(" Input Employee Name : ");
String name = input.next();

System.out.print(" Input Employee salary : ");
double salary= input.nextDouble();

System.out.print(" Enter number of years (max 5): ");
int year= input.nextInt();

System.out.println("");

if(salary <=50000){
System.out.println(" Salary must be greater than Rs. 50,000 to qualify for a loan.");
}

double monthlyInstallment = salary * 0.6;
double annualInterestRate = 0.15;
int months = year * 12;
double monthlyRate = annualInterestRate / 12;

double loanAmount = monthlyInstallment * 
(1 - Math.pow(1 + monthlyRate, -months)) / monthlyRate;

System.out.printf(" you can get a loan amount of: Rs. %.2f%n", name, loanAmount);
}

}
}
