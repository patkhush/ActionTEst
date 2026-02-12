package inclass.three.mavenproject1;

public class Mavenproject1 {

    public String greetings(){
        return "Hello world";
    }

    // ADD THIS PART:
    public static void main(String[] args) {
        Mavenproject1 app = new Mavenproject1();
        System.out.println(app.greetings());
    }
}