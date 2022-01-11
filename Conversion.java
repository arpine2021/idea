public class Conversion {
    public static void main(String[] args) {
        //byte b;
        //int i = 257;
        //double d= 323.145_555_555_555_5545555;
        //System.out.println(d);
       // long l = 1_234_567_890l;
        int i = Integer.MAX_VALUE;
        int j = i + 1;
// j will roll over to -2_147_483_648

        double d = Double.MAX_VALUE;
        double o = d + 1;
        /*System.out.println(l);
        b=(byte)i;
        System.out.println(b);
        i=(int)d;
        System.out.println(i);
        b=(byte) d;
        float a=56.2f;
        System.out.println(a);
        System.out.println(b);*/
        System.out.println(o);
        System.out.println(j);



    }
}
