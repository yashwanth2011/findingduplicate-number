import java.util.Scanner;
public class Duplicate {
        void Test() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array size:");
            int n = sc.nextInt();
            int j, i;
            int[] a = new int[10];
            System.out.println("Enter the array values:");
            for(i=0;i<n;i++) {
                a[i] = sc.nextInt();
                System.out.println("Input received "+ a[i]);
            }
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(a[i] == a[j]  ) {
                        System.out.println( a[i] );
                    }

                }

            }
        }
        public static void main(String[] args){
            Duplicate t = new Duplicate();
            t.Test();
        }
    }
