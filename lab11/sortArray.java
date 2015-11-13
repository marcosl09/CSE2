//Marcos Lozano Mendez
//CSE 2
//November 5, 2015

public class sortArray{
    
    public static void sort(int[] arr){
        for(int j = 0; j < arr.length; j++){
            int min = j;
            for(int k = j + 1; k < arr.length; k++){
                if(arr[k] < arr[min]){
                    min = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        int[] array = new int[20];
        int[] array2 = new int[10];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 101);
        }
        sort(array);
        System.out.print("Array list 1: ");
        for(int b = 0; b < array.length; b++){
            if(b < array.length -1)
                System.out.print( array[b] + ", ");
            else
                System.out.print(array[b] + ".");
        }
        
        for(int a = 0; a < array2.length; a++){
            array2[a] = (int) (Math.random() * 101);
        }
        sort(array2);
        System.out.print("\nArray list 2: ");
        for(int d = 0; d < array2.length; d++){
            if(d < array.length -1)
                System.out.print(array2[d] + ", ");
            else
                System.out.print(arrat2[d] + ".");
        }
        
       int[] array3 = new int[30];
       for(int c = 0; c < array3.length; c++){
           if(c < 20){
               array3[c] = array[c];
           }
           else if(c >= 20 || c < 30 ){
               array3[c] = array2[c - 20];
           }
       }
       sort(array3);
         System.out.print("\nArray list 3: ");
        for(int x = 0; x < array3.length; x++){
           System.out.print( + array3[x] + ", ");
        }
        
        
        
    }
    
}