
package com.perficient.com;

public class miniHuman extends Human {

    public miniHuman() {
    }
    
    public miniHuman(String name, String age, int heightInInches, String eyeColor) {
        super(name, age, heightInInches, eyeColor);
    }
    
    @Override
    public void speak(){
        System.out.println("no able to speak, because is a baby");
    }
    
    
}
