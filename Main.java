// class Calculator{
//     static int add(int a,int b){
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(10,20));
//         System.out.println(calc.add(10,20,30));
//     }
// }

class Parent{
     void show(){
        System.out.println("parent class");
     }
}
class Child extends Parent{
    void get(){
        System.out.println("child class");
    }
}
class Main{
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        c.show();
        c.get();
    }
}