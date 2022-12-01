import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generic<String,Integer> generic = new Generic<>("Java",25);
        System.out.println(generic.method("25",1));
        System.out.println(generic);
        generic.met(25);
        Integer[] integers = new Integer[10];
        integers[0]=10;
        integers[1]=12;
        integers[2]=1;
        integers[3]=20;
        integers[4]=10;
        integers[5]=10;
        integers[6]=10;
        integers[7]=10;
        integers[8]=24;
        integers[9]=25;
        method(integers);
    }
    static <T> void method(T [] array){
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
        System.out.println(Arrays.toString(array));
    }
}