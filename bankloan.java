import java.util.*;
public class bankloan{
    public static void main(String [] args){
        List<String> namel= new ArrayList<>();
        namel.add("Peter");
        namel.add("James");
        
       List<Integer> prinl=new ArrayList<>();
       prinl.add(10000);
       prinl.add(8000);

        List<Integer> timel=new ArrayList<>();
        timel.add(3);
        timel.add(2);

        List<Double> ratel=new ArrayList<>();
        ratel.add((Double)8.0);
        ratel.add((Double)7.0);

        List<Double> interl=new ArrayList<>();
        interl.add(prinl.get(0)*timel.get(0)*ratel.get(0)/100.0);
        interl.add(prinl.get(1)*timel.get(1)*ratel.get(1)/100.0);
        
        List<Double> amtl=new ArrayList<>();
        amtl.add(prinl.get(0)+interl.get(0));
        amtl.add(prinl.get(1)+interl.get(1));
        
        List<Integer> monthl=new ArrayList<>();
        monthl.add(timel.get(0)*12);
        monthl.add(timel.get(1)*12);

        List<Double> emil=new ArrayList<>();
        emil.add(amtl.get(0)/monthl.get(0));
        emil.add(amtl.get(1)/monthl.get(1));

        String s1= "Dear ";
        String s2=", Congrats on taking a loan of ";
        String s3=". You are required to pay an EMI of $";
        String s4=" for the next ";
        String s5=" months.";

        String line1=s1+namel.get(0)+s2+prinl.get(0)+s3+emil.get(0)+s4+monthl.get(0)+s5;
        System.out.println(line1);

       
       
            
        
        
    }
}