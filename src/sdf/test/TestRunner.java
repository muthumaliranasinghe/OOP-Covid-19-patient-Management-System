
package sdf.test;
import com.sun.net.httpserver.Authenticator.Failure;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;

public class TestRunner {
   
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(
		  sdf.test.PatientListTest.class // First Test Class
		  		// Other Test classes eparated by comma
		);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println(result.wasSuccessful());
   }
}
    

