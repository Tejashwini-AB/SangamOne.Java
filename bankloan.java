import java.util.*;
public class bankloan{
    public static void main(String [] args){
        List<String> namel= new ArrayList<>();
        namel.add("James");
        namel.add("Peter");
        namel.add("Susan");
       
       List<Integer> prinl=new ArrayList<>();
       prinl.add(10000);
       prinl.add(8000);
       prinl.add(5000);

        List<Double> timel=new ArrayList<>();
        timel.add(3.0);
        timel.add(2.0);
        timel.add(1.5);

        List<Double> ratel=new ArrayList<>();
        ratel.add(8.0);
        ratel.add(7.0);
        ratel.add(6.0);

        List<Double> interl=new ArrayList<>();
        interl.add(prinl.get(0)*timel.get(0)*ratel.get(0)/100.0);
        interl.add(prinl.get(1)*timel.get(1)*ratel.get(1)/100.0);
        interl.add(prinl.get(2)*timel.get(2)*ratel.get(2)/100.0);

        
        List<Double> amtl=new ArrayList<>();
        amtl.add(prinl.get(0)+interl.get(0));
        amtl.add(prinl.get(1)+interl.get(1));
        amtl.add(prinl.get(2)+interl.get(2));
        
        List<Integer> monthl=new ArrayList<>();
        monthl.add((int)Math.round(timel.get(0)*12));
        monthl.add((int)Math.round(timel.get(1)*12));
        monthl.add((int)Math.round(timel.get(2)*12));

        List<Double> emil=new ArrayList<>();
        emil.add(Double.parseDouble(String.format("%.2f",amtl.get(0)/monthl.get(0))));
        emil.add(Double.parseDouble(String.format("%.2f",amtl.get(1)/monthl.get(1))));
        emil.add(Double.parseDouble(String.format("%.2f",amtl.get(2)/monthl.get(2))));


        String s1= "Dear ";
        String s2=", Congrats on taking a loan of ";
        String s3=". You are required to pay an EMI of $";
        String s4=" for the next ";
        String s5=" months.";

        String line1=s1+namel.get(0)+s2+prinl.get(0)+s3+emil.get(0)+s4+monthl.get(0)+s5;
        String line2=s1+namel.get(1)+s2+prinl.get(1)+s3+emil.get(1)+s4+monthl.get(1)+s5;
        String line3=s1+namel.get(2)+s2+prinl.get(2)+s3+emil.get(2)+s4+monthl.get(2)+s5;
       
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        
    }
}
