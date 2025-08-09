//package Recursion;
//
//public class Question14 {
//    static int table(int n,int i){
//
//        if(i==11) return 0;
//
//       // System.out.println(n+"*"+i+"="+table(n,i));
//
//        return n+table(n,i+1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println( table(2,1));
//    }
//}

package Recursion;
public class Question14 {
    static void table(int n,int i,int table){

        if (i==11) return;
        table=n*i;
        System.out.println(n+"*"+i+"="+table);
        table(n,i+1,table);
    }

    public static void main(String[] args) {
        table(2,1,1);
    }
}