package constructor;

public class PC2 {
    String companyName;
    String designation;
    int code;

    public PC2(String companyName,String designation,int code){
        this.companyName=companyName;
        this.designation=designation;
        this.code=code;
    }

    public void display(){
        System.out.println("CompanyName is " + companyName);
        System.out.println("Designation is " + designation);
        System.out.println("Code is " + code);
    }

    public static void main(String[] args) {
        PC2 pc2=new PC2("IEX","Executive Officer",201);
        pc2.display();
    }
}
