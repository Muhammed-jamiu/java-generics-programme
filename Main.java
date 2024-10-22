public class Main {


    public static <E> void printArray(E[] inputArray) {
        //Display Array element
        for (E element : inputArray) {
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        //creating Array of integer,double, character
        Integer[] intArray= {1,2,3,4,5,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character[] charArray= {'H','E','L','L','O'};

        System.out.println("Array intArray contains:");
        printArray(intArray);//pass an Integer Array

        System.out.println("Array doubleArray contains:" );
        printArray(doubleArray);// pass a Double Array

        System.out.println("Array characterArray contains:");
        printArray(charArray);// pass Character Array
    }
}