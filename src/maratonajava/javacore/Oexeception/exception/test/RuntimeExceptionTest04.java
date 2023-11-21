package maratonajava.javacore.Oexeception.exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
        System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
    }
}
