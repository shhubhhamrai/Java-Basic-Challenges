package Challenges;

public class ArraySum {
    public static void main(String[] args) {
        int[] a= {5,7,6,9,8,1,-15,2,6};

        int sum=0;
        System.out.print("Array elements: ");
        for (int num : a){
            System.out.println(num+ " ");
            sum += num;
        }
        System.out.println("\nSum of Array Elements: "+sum);
    }
}
