public class Assignment2 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        n2.i = 10;// what is n1.i?
        n1.i = 20;// what is n2.i?
        //n1.i=20
        //n2.i=20 Vì n1 và n2 đều tham chiếu đến cùng một đối tượng
        System.out.println("n1 = " + n1.i);
        System.out.println("n2 = " + n2.i);
    }
}
