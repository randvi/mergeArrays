import java.util.Arrays;

public class mergeArrays {

    public static void main(String[] args){
        int[] a = {1, 5, 7, 8, 20};
        int[] b = {2, 6, 7, 9, 10, 20};
        
        int[] c = new int [a.length + b.length]; 

        c = mergeArrays(a, b);
        System.out.print("Array A: ");  
        System.out.println(Arrays.toString(a)); 
        System.out.print("Array B: "); 
        System.out.println(Arrays.toString(b)); 
        System.out.print("Merge array: ");  
        System.out.println(Arrays.toString(c));      
    } 

    // merge two arrays
    // 1 variant
    /*
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0;
        while(i + j < result.length) {
            if ((j == a2.length) || (i < a1.length && a1[i] <= a2[j])) {
                result[i+j] = a1[i++];
            } else { 
                result[i+j] = a2[j++];
            }        
        }
        return result;
    }
    */
    
    // 2 variant
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0;
        for(; i + j < result.length; 
            result[i+j] = i < a1.length ? 
                    (j < a2.length ? (a1[i] < a2[j] ? a1[i++] : a2[j++]) : a1[i++]) : a2[j++]);       
        return result;
    }   
}