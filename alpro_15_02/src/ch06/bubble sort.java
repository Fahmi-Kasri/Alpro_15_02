public static void main(String args[]){

        int array[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("\nAngka sebelum diurutkan:\n");

        for(int k=0; k < array.length; k++)
            System.out.print( array[k]+"  ");

        System.out.println("\n");

        //Pengurutan dimulai

        int i,j,temp=0;
        for(i = 0; i < array.length; i++){
            for(j = 1; j < (array.length-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Pengurutan angka:\n");
        for(int k = 0; k <array.length; k++)
            System.out.print(array[k]+"  ");
    }
}