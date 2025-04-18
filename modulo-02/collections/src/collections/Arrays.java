package collections;

public class Arrays {
    public static void main(String[] args) {
        Integer[] array = new Integer[6];

        array[0] = 1;
        array[1] = 5;
        array[2] = 6;
        array[3] = 7;
        array[4] = 10;
        array[5] = 12;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        Integer[] array2 = { 3, 7, 9 };

        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
