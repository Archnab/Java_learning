public class Main { public static void main(String[] args) {

        /*System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");*/
        /*
        final int maxStudents = 100;
        final int someVariable;
        final int someOtherVariable = 100;
        someVariable = someOtherVariable;
        System.out.println(someVariable);
        int someValue = 5;


        long longVal = 7;
       // PAS POSSIBLE short result = longVal;
        short result = (short) longVal;

        int value1 = 7;
        int value2 = 5;

        int maxValue = value1 > value2 ? value1:value2;
        System.out.println(maxValue);
        */

        double value1 = 100;
        double value2 = 50;
        double result;
        char operationCode='a';

        if (operationCode == 'a')
            result = value1 + value2;
        else if (operationCode == 's')
            result = value1 - value2;
        else if (operationCode == 'm')
            result = value1 * value2;
        else if (operationCode == 'd')
            result = value1/value2;
        else
            result = 0;
        System.out.println(result);




}
}