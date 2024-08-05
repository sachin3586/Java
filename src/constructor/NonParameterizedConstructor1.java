package constructor;

public class NonParameterizedConstructor1 {

    String companyName;
    String designation;
    String department;

    public NonParameterizedConstructor1(){
        companyName="NTPC";
        designation="Senior Executive Engineer ";
        department="Electrical";
    }
    public void displayInfo(){
        System.out.println("Company name is " + companyName);
        System.out.println("Designation is " + designation);
        System.out.println("Department is " + department);
    }

    public static void main(String[] args) {
        NonParameterizedConstructor1 nonParameterizedConstructor1=new NonParameterizedConstructor1();
        nonParameterizedConstructor1.displayInfo();
    }
}
