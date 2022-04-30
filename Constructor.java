public class Constructor{
    public static void main(String[] a){
        Circle1 c1 = new Circle1(10f);
        System.out.println("area of circle = " + c1.area());

        Circle1 c2 = new Circle1(20f);
        System.out.println("area of circle = " + c2.area());

        Circle1 c3 = new Circle1();
        c3.radius = 15f;
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle1{
    public float radius;

    //Default Constructor
    public  Circle1(){}

    //Parameterized Constructor
    public Circle1(float r) {
        radius = r;
    }

    public float area(){
        return 3.141f * radius * radius;
    }
}





