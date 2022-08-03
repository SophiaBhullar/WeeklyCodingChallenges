import java.util.Arrays;

public class SelectivelyReverseArray{
    public static void selReverse(int[] arr, int k){

        int len = arr.length;

        for(int i=0;i<len;i=i+k){
            int start = i;
            int end = Math.min(i+k-1,len-1);

            while(start<=end){
                int temp;
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }


public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6};
    int k1 = 3;
    System.out.println("Array elements are: "+Arrays.toString(arr1)+" and k = "+k1);
        
    selReverse(arr1, k1);
    
    System.out.println("Reversed array:");
    for(int val:arr1)
    {
        
        System.out.print(val+" ");
        
    }
    System.out.println("\n");

    int[] arr2 = {2,4,6,8,10,12,14,16};
    int k2 = 3;
    System.out.println("Array elements are: "+Arrays.toString(arr2)+" and k = "+k2);
        
    selReverse(arr2, k2);
    
    System.out.println("Reversed array:");
    for(int val:arr2)
    {
        
        System.out.print(val+" ");
    }
    
    System.out.println("\n");

    int[] arr3 = {5,7,2,6,0,4,6};
    int k3 = 100;
    System.out.println("Array elements are: "+Arrays.toString(arr3)+" and k = "+k3);
        
    selReverse(arr3, k3);
    
    System.out.println("Reversed array:");
    for(int val:arr3)
    {
        
        System.out.print(val+" ");
    }
}
}




