import java.util.Scanner;

public class Question2 {

    public static void main (String [] args){
        printBigAverage();
    }

    public static void printBigAverage (){
        Scanner scanner = new Scanner(System.in);
        int array []= new int[10];
        int index = 1;
        double average=0;
        while (index<array.length+1){
            System.out.println("Enter the " + index + " number");
            array [index-1]= scanner.nextInt();
            index ++;
        }
        index = 0;
        while (index<array.length){
            average = average + array[index] ;
            index ++;
        }
        average = average/10;
        index = 0;
        System.out.println("the average is" + average);
        while (index<array.length){
            if (array [index]>average)
            {
                System.out.println(array[index]+ "  is bigger the average");
            }
            index++;
        }
    }
}
