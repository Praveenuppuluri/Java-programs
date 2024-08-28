import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a= new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println("Enter the key : ");
            int key = sc.nextInt();
            int pos = search(key,a,0,n-1);
            System.out.println("Key is found at :"+pos);
        }
    }
    public static int search(int key,int[] a,int low,int high){
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a[mid]==key )
                return mid;
            else if (key<a[mid]) {
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return -1;
    }
}
