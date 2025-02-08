package string_concatenation_performance;

public class StringConcatenationPerformance_03 {

    public static void main(String[] args) {
        int[] sizes={1000, 10000, 1000000};

        for(int i=0; i<sizes.length; i++){
            int n=sizes[i];
            System.out.println("Comparing performance for "+ sizes[i] +" strings.");
            usingStringBuilder(n);
            usingStringBuffer(n);
            usingString(n);
        }
    }

    public static String usingString(int n){
        long startTime=System.nanoTime();
        String string="";
//        for(int i=0; i<n; i++){
//            string += "Ojas";
//        }
        while(n>0){
            string += "O";
            n--;
        }
        long endTime=System.nanoTime();
        System.out.println("String      :"+(double)(endTime-startTime)/1000+" ms");
        return string;
    }

    public static String usingStringBuilder(int n){
        long startTime=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append("O");
            n--;
        }
        long endTime=System.nanoTime();
        System.out.println("StringBuilder:"+(double)(endTime-startTime)/1000+" ms");
        return sb.toString();
    }

    public static String usingStringBuffer(int n){
        long startTime=System.nanoTime();
        StringBuffer sf=new StringBuffer();
        while(n>0){
            sf.append("O");
            n--;
        }
        long endTime=System.nanoTime();
        System.out.println("StringBuffer :"+(double)(endTime-startTime)/1000+" ms");
        return sf.toString();
    }
}
