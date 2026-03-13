package module6;

public class sumofelements {
    public static void main(String[] args) {

        int arr[]={10,15,20,25,30,35,40,45,50};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of elements of an Array: "+sum );
    }
}

