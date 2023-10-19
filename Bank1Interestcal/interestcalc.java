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

        String dt1="";
        double time1=1.0/365;
        double rate1=5.0/100;
        int credit=0;
        int debit=0;
        double interest1=0.0;
        int opening1=0;
        int principal1=0;
        int pos=0;
        double tint=0.0;
        List<Double> intl=new ArrayList<>();
        
       
        for(int i=0;i<date2.size();i++){
            dt1=date2.get(i);
            if(dt1.equals(date1.get(pos))){
                credit=credit1.get(pos);
                debit=debit1.get(pos);
                pos=pos+1;
            }
            else{
                credit=0;
                debit=0;
            }
            opening1=principal1;
            principal1=opening1+credit-debit;
            interest1=principal1*time1*rate1;
            intl.add(interest1);
            tint=tint+interest1;

        }
        System.out.printf("The total interest paid by Bank1: Rs %.2f%n",tint);//printf is to format the total interest to have only 2 numbers after decimal

       
        


    }
}
