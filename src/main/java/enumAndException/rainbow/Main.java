package enumAndException.rainbow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(EnumRainbow.values()));
        System.out.println(EnumRainbow.BLUE.ordinal());
    }
}
