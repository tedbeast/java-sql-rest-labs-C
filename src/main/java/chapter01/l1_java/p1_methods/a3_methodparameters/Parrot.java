package chapter01.l1_java.p1_methods.a3_methodparameters;

public class Parrot {
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * You may notice that replacing the text "return text please!" with "hello" or "polly" will work for one
     * test, but will fail the other. This is because the test cases are setting up different scenarios to test the
     * functionality of this method - it will always expect the method to return the same variable that was provided
     * to the method. So, one of the following lines will work:
     *
     * return "return text please!";
     * return "hello";
     * return hello;
     * return "polly";
     * return polly;
     * return "text";
     * return text;
     * return;
     * return String;
     * ;
     *
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    public String copy(String text){
        return "return text please!";
    }
}