import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray;
        System.out.println("Enter the size of array");
        sizeArray = scanner.nextInt();
        int[] array1 = new int[sizeArray];
        int index = 1;
        while (index < array1.length+1) {
            System.out.println("Enter the " + index + " number");
            array1[index-1] = scanner.nextInt();
            index++;
        }
        array1 = checkArray(array1,sizeArray);
        index = 0;
        while (index < array1.length) {
            if (array1[index]!=0) {
                System.out.print(array1[index] + ", ");
            }
            index++;
        }
    }


    public static int[] checkArray(int[] array1 , int sizeArray) {
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int newNum;
        int counter = 0;
        int[] newArray = new int[sizeArray];
        while (index1 < array1.length) {
            while (index2 < newArray.length-1) {
                if (array1[index1] == newArray[index2]) {
                    counter++;
                }
                index2++;
            }
            if (counter == 0) {
                newNum = array1[index1];
                newArray[index3] = newNum;
                index3++;
            }
            index1++;
            counter = 0;
            index2 = 0;
        }
        return newArray;
    }
}
