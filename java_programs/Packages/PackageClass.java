package mypackage;
public class PackageClass {
  private String FirstName = "";
  public PackageClass(String FirstName){
    this.FirstName = FirstName;
  }
  public String myName(){
    return FirstName;
  }
  public static void main(String[] args) {
    System.out.println("This is my test package class!");
    PackageClass PCObj = new PackageClass("Manimekalai");
    System.out.println("My name from myName methode(): "+PCObj.myName());
  }
}


// Commands:
// javac PackageClass.java
// javac -d . PackageClass.java
// java mypackage.PackageClass