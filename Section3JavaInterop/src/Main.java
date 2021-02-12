public class Main {

    public static void main(String[] args) {

        //we can access(use) to kotlin class from java class.
        Person person1 = new Person("Enver","Çelik");
        System.out.println(person1.getFirstName() +" "+ person1.getLastName());


        //also we can access to kotlin function from java class.
        int maxNumber = MaxKt.findMax(20,58);
        System.out.println("Max :" + maxNumber);

    }
}

