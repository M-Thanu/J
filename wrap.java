public class wrap {
    public static void main(String[] args){
        int a=10;
        double b=1.5;

        Integer oa = a;
        Double ob = b;

        int aa = oa;
        double ab = ob;

        Integer oc = 10;

        if(oa.equals(oc)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        int x = Integer.parseInt("456");
        Integer ox = Integer.valueOf(x);
    }
}
