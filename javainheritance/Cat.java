/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainheritance;

/**
 *
 * @author Themba
 * SubClass
 */
public class Cat extends Animal {

    public void setName(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }
    public void makeSound(){
        System.out.println("How does "+ this.getName()+"Make Soud??");
        System.out.println("Meoooooow");
    }
}
