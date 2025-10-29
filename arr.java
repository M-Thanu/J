import java.util.Scanner;
class arr{
    public static void main(String[] args){
        /*int[] arr1 = new int[5];

        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int a=0; a<5; a++){
            System.out.println("Enter: ");
            arr1[a]=sc.nextInt();
            sum=sum+arr1[a];
        }

        System.out.println("Total = "+ sum);*/

        int[][] arr2 = new int[3][2];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.print("{ ");
        for(int i=0; i<3; i++){
            System.out.print("( ");
            for(int j=0; j<2; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print(" ) ");
            System.out.print("\n");
        }
        System.out.print("}");
    }
}