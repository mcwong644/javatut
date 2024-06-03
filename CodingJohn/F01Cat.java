public class F01Cat extends F01Animal implements F01AnimalStuff {   


    @Override
    public void makeNoise() {
        System.out.println("Meow!");
        
    }

    @Override
    public void poop() {
        System.out.println("I'm a cat, so I'm pooping!");
        
    }

    @Override
    public void getCount() {
        System.out.println("I'm a cat, so I have " + count + " legs!");
    }


}