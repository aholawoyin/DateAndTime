package main.java.com.techhub;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

    public void run(){
        //example1();

        example2();
    }

    public void example1(){

        try{
            copyFile();
            System.out.println("Unreached Code");

        }catch (FileNotFoundException ex){
            System.out.println("Error0: reason => "+ex.getMessage());
        }
        catch (IOException ex){
            System.out.println("Error1: reason => "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Error2: reason => "+ex.getMessage());
        }finally {
            System.out.println("We are finally out of error");
        }

    }

    void copyFile() throws IOException {
        File file = new File("reg.txt");
        if(!file.exists()){
            throw new FileNotFoundException("The Reg file has not been created, please contact the admin.");
        }
        FileReader fileReader = new FileReader(file);
        char[] buffer = new char[100];
        fileReader.read(buffer);
        fileReader.close();
        System.out.println("System read => "+buffer);
    }

    void example2(){
      try
      {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter your name:");
          String name = input.nextLine();
          registerName(name);
      }
      catch (LongNameException ex){
          System.out.println("Error => reason "+ex.getMessage());
      }
    }

    void registerName(String name) throws LongNameException {
        if(name.length() > 10) throw new LongNameException("Name must not be longer than 10 characters");
        System.out.println("Your name is "+ name);
    }
}
