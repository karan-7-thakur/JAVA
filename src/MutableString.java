


public class MutableString {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Karan ");
        System.out.println(sb.hashCode());
        sb.append("Thakur");  // didnt create a new object, instead modified the existing one.
        System.out.println(sb.hashCode());

        String str = sb.toString();
        System.out.println(str);
    
        sb.insert(0, "java ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
