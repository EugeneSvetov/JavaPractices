import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static float negativeMin(ArrayList valera) {
        try {
            for (Object element : valera) {
                if ((float) element >= 0.0F) {
                    throw new IllegalArgumentException("У вас есть позитивные числа");
                }
            }
            float minValue = (float) Collections.min(valera);
            return minValue;

        } catch (IllegalArgumentException exc) {
            System.out.println(exc);
        } catch (ClassCastException exc) {
            System.out.println("Список не состоит только из типов float");
        }
        return 0.0F;
    }


    public static void main(String[] args) {
        ArrayList valera = new ArrayList(Arrays.asList(-1.0F, -5.0, -6.0F));
        System.out.println(negativeMin(valera));
    }
}
