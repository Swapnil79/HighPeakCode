import java.util.Arrays;
import java.util.Scanner;
public class Highpeak {
    static int minDiff(int array[], int N, int M){
        int result=Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i=0; i<=N-M; i++)
        result=Math.min(result,array[i+M-1]-array[i]);
        return result;
    }
    static int findelement(int res, int array[], int N, int M){
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++){
            result=Math.min(result,array[i+M-1]-array[i]);
            if(res==result)
            return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String items[]={"MI Band: 999", "Sandwich toaster:2195", "cukt pass: 2799", "Scale: 4999", "FitBit Plus:7980", "Microwave oven:9800", "Alexa:9999", "Didital Camera:11101", "Ipods:22349", "MacBook pro: 229900"};
        int N= array.length;
        System.out.println("Enter the number of Employees");
        Scanner s=new  Scanner(System.in);
        int M=s.nextInt();
        int result= minDiff(array,N,M);
        System.out.println("Number of employees:"+M);
        int startindex=findelement(result,array,N,M);

        System.out.println("here the goodies that are selected for distribution are:");
        for(int i=startindex; i<startindex+M; i++)

        System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("And the difference between the choosen goodies with highest priceand the lowest price is: + result");
    }
}
    

