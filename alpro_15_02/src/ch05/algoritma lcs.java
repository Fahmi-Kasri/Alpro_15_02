public class lcs { 
    int lcs(char[] X, char[] Y, int m, int n) 
    {  if (m == 0 || n == 0) 
            return 0; 
        if (X[m - 1] == Y[n - 1]) 
            return 1 + lcs(X, Y, m - 1, n - 1); 
        else
            return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));   }   
    int max(int a, int b) 
    {      return (a > b) ? a : b;  } 
    public static void main(String[] args)  { 
        lcs LCS = new lcs(); 
        String s1 = "FAHMI"; 
        String s2 = "KASRI";
        char[] X = s1.toCharArray(); 
        char[] Y = s2.toCharArray(); 
        int m = X.length; 
        int n = Y.length; 
  
        System.out.println("Panjang dari LCD adalah"
                           + " " + LCS.lcs(X, Y, m, n)); 
    } 
} 