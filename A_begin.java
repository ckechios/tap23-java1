/*
 * Hello world
 *  * Create integer, double, float
 * Show the java repl - jshell
 * show how System.out.println(a) with lowercase system fails
 * Create function p()
 * Prints a line
 * 
 */

public class A_begin {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int myNumer;
        // double myNumer;

        myNumer = (int) 5.7;

        System.out.println(myNumer);

        String str = "MyNumber";
        p(str + ":" + myNumer);
    }

    public static void p(Object line){
        System.out.println(line);
    }

}