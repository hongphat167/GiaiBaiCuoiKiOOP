import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Util {
    private Util() {
    }

    private static final String DATE_PATTERN = "dd/MM/yyyy";

    public static String inputString(String message) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print(message + ": ");
            str = sc.nextLine();
        } while (str.isBlank());
        return str;
    }

    public static String inputString(String message, boolean allowEmpty) {
        Scanner sc = new Scanner(System.in);
        String str;
        if (allowEmpty) {
            message += "(Allow null or empty)";
        }
        do {
            System.out.print(message + ": ");
            str = sc.nextLine();
        } while (!allowEmpty && str.isBlank());
        return str;
    }

    public static Float inputFloat(String message) {
        Float floatValue = null;
        String str;
        do {
            str = Util.inputString(message);
            try {
                floatValue = Float.valueOf(str);
            } catch (NumberFormatException ex) {
//                System.out.println("");
            }
        } while (floatValue == null);
        return floatValue;
    }

    public static Float inputFloat(String message, boolean allowNull) {
        Float floatValue = null;
        String str;
        do {
            str = Util.inputString(message, true);
            if (allowNull && str.isBlank()) {
                break;
            }
            try {
                floatValue = Float.valueOf(str);
            } catch (NumberFormatException ex) {
//                System.out.println("");
            }
        } while (floatValue == null);
        return floatValue;
    }

    public static Integer inputInt(String message, Integer minVal, Integer maxVal) {
        Integer intValue = null;
        String str = "";

        if (minVal != null) {
            str += "min value = " + minVal;
        }
        if (maxVal != null) {
            if (!str.isBlank()) {
                str += " and ";
            }
            str += "max value = " + maxVal;
        }
        if (!str.isBlank()) {
            message += "(" + str + ")";
        }
        do {
            str = Util.inputString(message);
            try {
                intValue = Integer.valueOf(str);
            } catch (NumberFormatException ex) {
//                System.out.println("");
            }
        } while (intValue == null || intValue < minVal || maxVal < intValue);
        return intValue;
    }

    public static Date inputDate(String message) {
        Date dateValue = null;
        String str;
        do {
            str = Util.inputString(message + " (" + Util.DATE_PATTERN + ")");
            dateValue = toDate(str);
        } while (dateValue == null);
        return dateValue;
    }

    public static Date inputDate(String message, boolean allowNull) {
        Date dateValue = null;
        String str;
        do {
            str = Util.inputString(message + " (" + Util.DATE_PATTERN + ")", true);
            if (allowNull && str.isBlank()) {
                break;
            }
            dateValue = toDate(str);
        } while (dateValue == null);
        return dateValue;
    }

    public static Date toDate(String dateString) {
        Date dateValue = null;
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_PATTERN);
        try {
            dateValue = df.parse(dateString);
        } catch (ParseException ex) {
//                System.out.println("");
        }
        return dateValue;
    }

    public static String toString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_PATTERN);
        return df.format(date);
    }


}
