package tests;

import lambda.Bar;
import lambda.Foo;
import lambda.Stuff;
import lambda.UseLambda;

import java.util.function.Function;

public class LambdaTest {

  public static void main(String[] args) {
    Foo foo = parameter -> parameter + " from foo";
    String result = UseLambda.add("Message ", foo);
    System.out.println("1 --- " + result);

    Function<String, String> fn = parameter -> parameter + " from function";
    result = UseLambda.add("Message ", fn);

    System.out.println("2 --- " + result);

    Function<String, String> fn3 = LambdaTest::createMessage;
    //Function<String, String> fn3 = parameter -> createMessage(parameter);
    result = UseLambda.add("Message ", fn3);

    System.out.println("3 --- " + result);

    Bar bar = Stuff::createStuff;
    //Bar bar = parameter -> Stuff.createStuff(parameter);
    UseLambda.execute("you", bar);

    Function<String, Stuff> example = Stuff::createStuff;
    Function<String, Stuff> test = lambdaception(example);
    test.apply("inception");
  }

  private static String createMessage(final String parameter) {
    return parameter + " from method";
  }

  private static Function<String, Stuff> lambdaception(Function<String, Stuff> function){
    return function;
  }
}
