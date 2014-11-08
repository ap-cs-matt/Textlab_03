// TextLab03st.java
// The Mortage Payment Program
// This the student, v90 of the TextLab03 assignment.

public class TextLab03v100_MatthewPearce
{
    public static void main(String args[])
    {
        System.out.println("TextLab03, 100 Point Version\n");
       
        double principal  = 259000;
        double annual_rate_per = 5.75;
        double num_years   = 30;
        
        double month_rate_int= annual_rate_per/1200.0;
        double num_months = num_years *12 ;         //number of mothns to pay off payment
        double monthly_payment = ((month_rate_int*(Math.pow((1+month_rate_int),num_months))) / ((Math.pow((1+month_rate_int),num_months))-1))*principal;
        
        
         System.out.println("Principal:        $"+principal);
         
         System.out.println("Annual Rate:       "+ annual_rate_per +"%");
        
         System.out.println("Number of Years:   "+num_years);
         
         // Math.round(value *100.0 )/100.0 rounds the number to 2 digits of precision
      
         System.out.println("Monthly Payment:  $"+ Math.round(monthly_payment*100.0) / 100.0);
       
       //defining total payment and total interest after the amount due per month has been rounded
       
         monthly_payment = Math.round(monthly_payment*100.0)/100.0;
        double tot_payment = monthly_payment*num_months;
        double tot_interest = tot_payment - principal;
       
         
         
         System.out.println("Total Payment:    $"+Math.round(tot_payment*100.0)/100.0) ;
        
         System.out.println("Total Interest:   $"+ Math.round(tot_interest*100.0)/100.0);
        
        
        
        
        
        }
    }