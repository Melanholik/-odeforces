import java.util.ArrayList;

public class SpeciallyForDima {

    public static ArrayList<IdName> iziPizzi(String[] names) {
        ArrayList<IdName> list = new ArrayList<>();
        int length = names.length;
        int[] ids = new int[length];
        for (int i = 0; i < length; i++) {
            ids[i] = i + 1;
        }


        int lastElement = length;
        for (String name : names) {
            int id = (int) (Math.random() * lastElement);
            list.add(new IdName(ids[id], name));
            lastElement--;
            int newId = ids[lastElement];
            ids[lastElement] = ids[id];
            ids[id] = newId;
        }
        return list;
    }


    public static class IdName {
        int id;
        String name;
        boolean isHorse = false;

        public IdName(int id, String name) {
            this.id = id;
            this.name = name;
            if (id == 3) {
                isHorse = true;
            }
        }

        @Override
        public String toString() {
            return "IdName{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", isHorse=" + isHorse +
                    '}';
        }
    }
}
