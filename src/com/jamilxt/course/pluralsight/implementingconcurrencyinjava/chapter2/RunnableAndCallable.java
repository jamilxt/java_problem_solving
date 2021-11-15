package com.jamilxt.course.pluralsight.implementingconcurrencyinjava.chapter2;

public class RunnableAndCallable {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunThread());
        thread.start();

        /*
           Runnable vs Callable (Java 5)
           1. Both functional interface
           2. Both represent a task to be executed by a thread
           3. (Runnable) Abstract method run    | (Callable) Abstract method call
           4. (Runnable) Returns void           | (Callable) Returns specified generic type
           5. (Runnable) Cannot throw           | (Callable) can throw exception
           6. (Runnable) submit returns Future  | (Callable) submit returns Future with generic type
              with null
         */
    }
}
