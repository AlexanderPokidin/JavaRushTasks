package my.javarash.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by asd on 14.03.2017.
 */
public class TestExit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;
        while (!isExit){
            String word = reader.readLine();
            System.out.println(word);
            isExit = word.equals("exit");
        }

        //another variant

/*        while (true){
            String word = reader.readLine();
            System.out.println(word);
            if (word.equals("exit")){
                break;
            }
        } */
    }
}
