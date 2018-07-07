import Arrays;
public class mergeArray {

    public static void main(String[] args){
        int[] a = {1, 5, 7, 8, 20};
        int[] b = {2, 6, 7, 9, 10, 20};
        
        int[] c = new int [a.length + b.lenght]; 

        c = mergeArrays(a, b);
        System.out.print("Array A: "):  
        System.out.println(Arrays.toString(a)): 
        System.out.print("Array B: "): 
        System.out.println(Arrays.toString(b)): 
        System.out.print("Marge array: "):  
        System.out.println(Arrays.toString(c)):      

    } 

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10}; //new int[size];
        return result;
    }
}