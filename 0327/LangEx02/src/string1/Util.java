package string1;

public class Util {
    private String strName;

    public Util(String strName) {
        this.strName = strName;
    }

    public String capitalize() {
        String[] names = strName.split(" ");

        for(int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
        }

        return String.join(" ", names);
    }
}
