package day3;

public class Test2For {
    //✅❌
    public static void main(String[] args) {
//        System.out.println("✅❌✅❌✅❌✅❌");
//        System.out.println("❌✅❌✅❌✅❌✅");
//        System.out.println("✅❌✅❌✅❌✅❌");
//        System.out.println("❌✅❌✅❌✅❌✅");
//        System.out.println("✅❌✅❌✅❌✅❌");
//        System.out.println("❌✅❌✅❌✅❌✅");
//        System.out.println("✅❌✅❌✅❌✅❌");
//        System.out.println("❌✅❌✅❌✅❌✅");

        for(int i=1 ; i<=8 ; i++){//rows
            for(int j=1 ; j<=8 ; j++){//columns
                if(i%2 == j%2){
                    System.out.print("✅");
                }else{
                    System.out.print("❌");
                }
            }
            System.out.println();
        }
    }
}
