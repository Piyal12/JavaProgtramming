public class StringTest {
    public static void main(String[] args) {
        String s="  ak      hgf=slkxna%&#    ";
        String str="PPPPiyyall";
        String trim = s.substring(0, s.indexOf("=")).replaceAll("\\s+","");
        System.out.println(trim);
        int p = str.indexOf("z");
        int p1 = str.indexOf("P");
        int p2 = str.indexOf("i");
        int p3 = str.indexOf("y");
        int p4 = str.indexOf("a");
        int p5 = str.indexOf("l");
        int p6 = str.indexOf("l");
        System.out.println("Piyal   " +p+p1+p2+p3+p4+p5+p6);
        String revStr="";
        for(int i=0;i<str.length()-1;i++){
            if(revStr.indexOf(str.charAt(i))==-1){
                revStr = str.charAt(i)+revStr;
            }
        }
        System.out.println(revStr);
    }
}
