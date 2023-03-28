package winterstudying.StringPro;

public class Stringmethod {
    public static void main(String[] args) {
        String str="teruwithwing";
        //1.length()方法获取长度！
        System.out.println(str.length());
        System.out.println("---------");

        //2.char charAt(int index)获取第index号的字符
        char ch=str.charAt(2);
        System.out.println(ch);
        System.out.println("---------");

        //3.将字符串转化为字符数组 :toCharArray()
        char[] s=str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("---------");

        //4.截取字符串内容 ： str.substring(int begin, int end) 前取后不取
        System.out.println(str.substring(0, 3));
        System.out.println("---------");

        //5.截取字符串直到末尾：  str.substring(int begin）
        System.out.println(str.substring(5));
        System.out.println("---------");

        //6.将字符串中的某个字符或字符串替换:  replace("old","new")
        String st=(str.replace("teru", "hy"));
        System.out.println(st);
        System.out.println("---------");

        //7.判断是否含有某个字符串:   contains()
        System.out.println(st.contains("hy"));
        System.out.println("---------");

        //8.判断字符串以某一字符开头： startsWith(String s)
        System.out.println(st.startsWith("hywith"));
        System.out.println("---------");

        //9.按照某个内容把字符串分割成字符数组返回: String [] split(String s)即以s为间隔进行切割
        String as="hy,gyt,zy";
        String[] sb=as.split(",");//此处以，为间隔分别获取字符串数组
        for (int i = 0; i < sb.length; i++) {
            System.out.println("choice is:"+sb[i]);
        }
    }
}
