import java.util.ArrayList;


class SpeciallyForDimaTest {

    void iziPizzi() {
        String[] names = new String[]{"Dima", "Vitalik", "Sasha", "Artur", "Senia"};
        for (int i = 0; i < 4; i++) {
            ArrayList<SpeciallyForDima.IdName> list = SpeciallyForDima.iziPizzi(names);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
            System.out.println("===================================================");
        }
    }
}