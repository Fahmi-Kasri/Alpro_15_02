package05;

import java.util.Scanner;
public class lagoritmakadane
{   public int maxSequenceSum(int[] arr)
    {         int jumlahawal = arr[0], jumlahakhir = arr[0];
        for (int i = 1; i < arr.length; i++){   
            if (jumlahakhir < 0){
                jumlahakhir = arr[i];
            }else{
                jumlahakhir += arr[i];        }    
            if (jumlahakhir >= jumlahawal)
                jumlahawal = jumlahakhir;   }
        return jumlahawal;  }    
    public static void main (String[] args) 
    {     Scanner scan = new Scanner(System.in);
        System.out.println("Algoritma Kadane\n");      
        lagoritmakadane k = new lagoritmakadane();
        System.out.println("Masukkan Besar Array :");
        int N = scan.nextInt();
        System.out.println("Masukkan "+ N +" elemen array");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        int sum = k.maxSequenceSum(arr);
        System.out.println("\nMaximum Sequence sum = "+ sum);
 
    }
}