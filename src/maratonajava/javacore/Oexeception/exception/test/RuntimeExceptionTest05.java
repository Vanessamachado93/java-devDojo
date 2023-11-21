package maratonajava.javacore.Oexeception.exception.test;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndex | IllegalArgumention | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}

