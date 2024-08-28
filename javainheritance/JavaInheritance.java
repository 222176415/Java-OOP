package javainheritance;

/**
 *
 * @author Themba Ntimane Self Practice Inheritance
 */
public class JavaInheritance {
   public void Brief(){
       System.out.println("This Is An Example of inheritance with Polym");
        System.out.println("SuperClass: Animal ,SubClass : Cat and Dog");
   }
    public static void main(String[] args) {
        JavaInheritance DisplayBrief = new JavaInheritance ();
        DisplayBrief.Brief();
        System.out.println(" ");
        Animal NewCat = new Cat(); //Creating an Instance of a Cat Which is "Kitty"
        NewCat.name = "Kitty";
        NewCat.makeSound();
        
        System.out.println(" ");
        
        Animal Newdog = new Dog(); // Creating an Instance of a Dog Which is "Danger"
        Newdog.name = "Danger";
        Newdog.makeSound();

    }

}
