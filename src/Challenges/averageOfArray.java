package Challenges;

public class averageOfArray {
    public static void main(String[] args) {
        int[] a = {5,7,6,9,8,1,-15,2,6};
        int sum =0;
        System.out.println("Array elements: ");
        for (int num : a){
            System.out.print(num+" ");
            sum+=num;
        }
        double avg = (double) sum/a.length;

        System.out.println("\nSum of array elements: "+sum);
        System.out.println("Average of array elements: "+avg);
    }
}
