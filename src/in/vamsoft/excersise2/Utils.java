package in.vamsoft.excersise2;
/*
 * @author vignesh
 */
import java.util.*;

public class Utils {
  public static String calmString(String speech) {
    if (speech != null) {
      speech = speech.replaceAll("!", "");
    }
    return(speech);
  }
  
  public static void calmAttendees(List<String> attendingParties) {
    if (attendingParties != null) {
      if (attendingParties.contains("Republican") && attendingParties.contains("Democrat")) {
        if (Math.random() < 0.5) {
          attendingParties.remove("Republican");
        } else {
          attendingParties.remove("Democrat");
        }
      }
    }
  }
  
  private Utils() {} // Class cannot be instantiated: only static methods
}
