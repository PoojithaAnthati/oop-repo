public class GetterMethod{
    public static void main(String[] a) {
        Circle5 c1 = new Circle5(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle5 c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle5{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle5(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





