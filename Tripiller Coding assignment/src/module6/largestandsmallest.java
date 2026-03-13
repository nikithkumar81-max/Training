package module6;

public class largestandsmallest {
    public static void main(String[] args) {
        int[] arr={5,17,20,22,45,18,77};
        int largest=0,  smallest=100;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            if (arr[i]<smallest){
                smallest=arr[i];
            }

        }
        System.out.println("Largest Value Is : "+largest);
        System.out.println("Smallest Value is: "+smallest);
    }
}

