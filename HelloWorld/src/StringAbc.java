public class StringAbc {
    public static void main(String[] args) {
        String str ="Punjab";
        int stringlength = str.length();
        System.out.println("stringlength is :");
        System.out.println(stringlength);
        String sub_string = str.substring(0);
        System.out.println(sub_string);
        String sub_string1 = str.substring(0 ,4);
        System.out.println(sub_string1);
        String sub_string2 = str.toLowerCase();
        System.out.println(sub_string2);
        String sub_string3 = str.toUpperCase();
        System.out.println(sub_string3);
    }
}
