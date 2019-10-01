import java.sql.SQLOutput;

public class Average2 {

    public static void main (String[] args){

        int[] array1 = new int[4];

        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 15;
        array1[3] = 20;

        int sum = 0;

        for(int i = 0; i<array1.length;i++){
            System.out.println("Значения цикла: " + array1[i]);
        }

        for(int i = 0; i<array1.length; i++){
            sum+=array1[i];
        }
        int averAny = sum/array1.length;
        System.out.println();
        System.out.println("Среднее арифметическое значений цикла: " + averAny);

    }
}
