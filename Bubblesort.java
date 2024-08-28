import java.util.*;
public class bubble {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            int[] a= new int[size];

            System.out.print("Enter the array elements: ");
            for(int i=0;i<size;i++){
                a[i]=sc.nextInt();
            }
            sort(size,a);
            System.out.print("Sorted list:");
            for(int i=0;i<size;i++){
                System.out.print(" "+a[i]);
            }
        }
    }
    public static void sort(int size,int a[]){
        int i,j,temp;
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
