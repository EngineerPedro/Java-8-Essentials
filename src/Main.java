import model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive("California", 0x2E0854, 3));
        olives.add(new Olive("Colorado", 0x2E0854, 7));
        olives.add(new Olive("Nevada", 0x2E0854, 12));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}

