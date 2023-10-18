import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;
public class interestcalc{
    public static void main(String []args)throws FileNotFoundException{
        File f1=new File("Interest.csv");
        Scanner sc= new Scanner(f1);
        List<String>date1=new ArrayList<>();
        List<Integer>credit1=new ArrayList<>();
        List<Integer>debit1=new ArrayList<>();
        List<String>date2=new ArrayList<>();

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate mydate1;
        LocalDate mydate2;
        String mydate3;
        String[] list1;
        for(int i=0;i<62;i++){
            mydate1=LocalDate.of(2023, 7, 1);
            mydate2=mydate1.plusDays(i);
            mydate3=mydate2.format(dtf1);
            date2.add(mydate3);
        
        }
        String infor1=sc.nextLine();
        for(int i=0;i<19;i++){
            list1=sc.nextLine().split(",");
            date1.add(list1[0]);
            if(list1[1]==""){
                credit1.add(0);
            }
            else{
                credit1.add(Integer.parseInt(list1[1]));
            }
            if(list1[2]==""){
                debit1.add(0);
            }
            else{
                debit1.add(Integer.parseInt(list1[2]));
            }
   
        }
        System.out.println(credit1.get(1));
        System.out.println(debit1.get(1));
        System.out.println(date2);
        System.out.println(date1);
            

        String dt1="";
        double time1=1.0/365;
        double rate1=5.0/100;
        int credit=0;
        int debit=0;
        double interest1=0.0;
        int opening1=0;
        int principal1=0;
        //Use a variable called position to keep the track of transactions
        //Increment in psotion should happen only when the dates in list date1 & date2 are same

        //We have hard coded the transactions for the first 5 days.
        //Changes should happen only when the dates match
        dt1=date2.get(0);
        if(dt1.equals(date1.get(0))){
            credit=credit1.get(0);
            debit=debit1.get(0);
        }
        else{
            credit=0;
            debit=0;
        }
        opening1=principal1;
        principal1=opening1+credit-debit;
        interest1=principal1*time1*rate1;
        System.out.println(interest1);

        dt1=date2.get(1);
        if(dt1.equals(date1.get(1))){
            credit=credit1.get(1);
            debit=debit1.get(1);
        }
        else{
            credit=0;
            debit=0;
        }
        opening1=principal1;
        principal1=opening1+credit-debit;
        interest1=principal1*time1*rate1;
        System.out.println(interest1);

         dt1=date2.get(2);
        if(dt1.equals(date1.get(2))){
            credit=credit1.get(2);
            debit=debit1.get(2);
        }
        else{
            credit=0;
            debit=0;
        }
        opening1=principal1;
        principal1=opening1+credit-debit;
        interest1=principal1*time1*rate1;
        System.out.println(interest1);
        

        dt1=date2.get(3);
        if(dt1.equals(date1.get(3))){
            credit=credit1.get(3);
            debit=debit1.get(3);
        }
        else{
            credit=0;
            debit=0;
        }
        opening1=principal1;
        principal1=opening1+credit-debit;
        interest1=principal1*time1*rate1;
        System.out.println(interest1);

        dt1=date2.get(4);
        System.out.println(dt1);
        System.out.println(date2.get(4));
        if(dt1.equals(date1.get(1))){
            credit=credit1.get(1);
            debit=debit1.get(1);
            System.out.println(credit);
            System.out.println(debit);
        }
        else{
            credit=0;
            debit=0;
        }
        opening1=principal1;
        principal1=opening1+credit-debit;
        interest1=principal1*time1*rate1;
        System.out.println(interest1);
        
        
        
        

       
       
        


    }
}
