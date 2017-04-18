
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRoot {

	public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0000");
        ArrayList<Double> result = new ArrayList<Double>();

        while (in.hasNextDouble()) {
            result.add(Math.sqrt(in.nextDouble()));
        }

        for(int i = result.size()-1; i >= 0; i--){
            System.out.println(df.format(result.get(i)));

        }
        in.close();
    }

}
