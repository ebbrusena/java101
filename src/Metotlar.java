public class Metotlar {
    static void print(){
        System.out.println("parametresiz metot");
    }
    static void print(int a){
        System.out.println("parametre:" + a);
    }
    static int print(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(2,3));
    }
}
