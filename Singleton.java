/**
 * Created by BRENDON on 2017/02/18.
 */
public class Singleton {

    private static class Dog{
        //1. create instance of object
        private static Dog instance = new Dog();
        //2. make private to ensure constructor doesnt
        //instantiate more than 1 object
        private Dog (){}
        //3. return object instance
        public static Dog getInstance(){return instance;}

        public String bark(){
            return "Bark Bark!! human";
        }
    }

    public static void main(String [] args){
        Dog dog = Dog.getInstance();
        System.out.print(dog.bark());
        //out:
        //Bark Bark!! human
    }


}
