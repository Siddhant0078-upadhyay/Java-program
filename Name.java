
public class Name {
    public static void main(String[] args) {
        String st = "Siddhant";
        int value = st.length() ;
        System.out.println(value);
        String lstring = st.toLowerCase();
        System.out.println(lstring);
        String Ustring = st.toUpperCase();
        System.out.println(Ustring);
        String name= "   Siddhant   ";
        System.out.println(name.trim());
        System.out.println(st.substring(4));
        System.out.println(st.substring(0,3));
        System.out.println(st.startsWith("Sid"));
        System.out.println(st.startsWith("hant5"));
        System.out.println(st.endsWith("hant"));
        System.out.println(st.charAt(5));
        System.out.println(st.indexOf("ant"));
        System.out.println(st.lastIndexOf("d"));
        System.out.println(st.equals("Siddhant"));
        System.out.println(st.equalsIgnoreCase("sIDHANT"));
    }
}
