package main.java.com.techhub;

public class StringDemo {
    public void run(){
        String1();

    }

    public void String1(){
        String firsName ="James";
        String lastName ="Bond";
        String fullName = firsName +" "+ lastName;
        String fullNameWithInitial = "Mr. "+firsName+" "+lastName;

        char[] letters = fullName.toCharArray();

        StringBuilder builder = new StringBuilder();
        builder.append("Mr. ");
        builder.append(firsName+" ");
        builder.append(lastName);

        System.out.printf("AllNames = %s", builder.toString());

    }
}
