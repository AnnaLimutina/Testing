package kata;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String newName = name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
        return newName.toUpperCase();
    }
}
