public static String BoyerMoore(String text, String pattern){
   if(text.length()!=0 || pattern.length()!=0){
      HashMap<Character, Integer> deltaTable = tabelDelta(pattern);
      displayDeltaTable(deltaTable);
      int i = pattern.length()-1;
      int j = 0;
 
      boolean ketemu = false;
      System.out.println("| i | j | ketemu | p[i] | t[j] |");
      System.out.println("---------------------------------");
 
      while(i<text.length() && !ketemu){
           j = pattern.length()-1;
           System.out.println("| "+i+" | "+j+" | "+ketemu+" | "+pattern.charAt(j)+" | "+text.charAt(i)+" | ");
 
           while(j>=0 && text.charAt(i)== pattern.charAt(j)){
           j--; i--;
           if(i>-1 && j>-1)
             System.out.println("| "+i+" | "+j+" | "+ketemu+" | "+             pattern.charAt(j)+" | "+text.charAt(i)+" | ");
     }
     if(j == -1){
         ketemu = true;
     }else{
     if(deltaTable.get(text.charAt(i))==null){
         i = i + max(deltaIsNull(deltaTable),pattern.length()-j);
     }else{
        i = i + max(deltaTable.get(text.charAt(i)), pattern.length     ()-j);
      }
    }
  }
    t(i)+" | "+pattern.charAt(j)+" | ");
    if(ketemu){
       return "Pattern "+pattern+" ditemukan pada teks "+text;
    }else{
        return "Pattern "+pattern+" tidak ditemukan pada teks "+te     xt;
   }
 }
    return "String kosong";
 }