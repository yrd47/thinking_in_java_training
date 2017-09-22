package chapter2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yrd on 2017/9/22.
 */
public class Exercise2Test {

    @Test
    public void mainTest() throws Exception {
        String expectStr = "Hello World";
        String classPath = System.getProperty("java.class.path");
        Process process = Runtime.getRuntime().exec(new String[] {"java", "-cp", classPath, chapter2.Exercise2.class.getName() });
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String result =bufferedReader.readLine();
        Assert.assertEquals(expectStr, result);
    }
}
