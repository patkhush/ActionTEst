
import inclass.three.mavenproject1.Mavenproject1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


/**
 *
 * @author patel
 */
public class HelloWorldTest {
    
   
     @Test
     public void hello() {
         Mavenproject1 uu = new  Mavenproject1();
         assertEquals("Hello world", uu.greetings());
         
     }
}
