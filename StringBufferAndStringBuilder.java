public class StringBufferAndStringBuilder {
    public static void main(String[] args){
       StringBuffer sb = new StringBuffer("Hari");
       sb.append("haran");
       sb.insert(0, "Java ");
       sb.length();
       sb.ensureCapacity(100);
       System.out.println(sb);

    //    String str = sb.toString();
    //    System.out.println(str);
    }
}
