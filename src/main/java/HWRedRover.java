public class HWRedRover {
    public static String getGradeBySwitchStatement(int grade) {
        String result = "";
        switch (grade) {
            case 1:
                result = "Bad";
                break;
            case 2:
                result = "Unsatisfactory";
                break;
            case 3:
                result = "Satisfactory";
                break;
            case 4:
                result = "Good";
                break;
            case 5:
                result = "Excellent";
                break;
        }
return result;
    }

    public static String getGradeBySwitchExpression(String grade) {
        String result = switch (grade) {
            case "E" -> "Bad";
            case "D" -> "Unsatisfactory";
            case "C" -> "Satisfactory";
            case "B" -> "Good";
            case "A" -> "Excellent";

            default -> throw new IllegalStateException("Unexpected value: " + grade);
        };
        return result;
    }
}
