class Student9 {
  protected final String name;
  protected int year;

  protected static final int annualFees = 10000;

  public Student9(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student9.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }

}

class ResearchStudent8 extends Student9 {
  protected String researchArea;
  // private static final int annualFees = 10000;

  public ResearchStudent8(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student9.annualFees * this.year*0.9f;
  }


  }


public class DynamicPolymorphismII {
  public static void main(String[] a) {

    Student9 s1 = new Student9("karan", 3);
    System.out.println(s1.getDetails());

    ResearchStudent8 s2 = new ResearchStudent8("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());


  }


}

