public class Main {

    public static void main(String[] args) {
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10,30.5);
        double dis = MyPoint.distance(a,b);
        System.out.println(dis);
    }
}
