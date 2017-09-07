package in.vamsoft.excersise2;
public class MappingTest {
  public static void main(String[] args) {
    Mapping mapper = new Mapping();
    System.out.println("English names");
    printNumbers(mapper, 22);
    String[] spanishNums =
      {"cero", "uno", "dos", "tres", "cuatro", "cinco",
       "seis", "siete", "ocho", "nueve", "diez", "once",
       "doce", "trece", "catorce"};
    mapper = new Mapping(spanishNums);
    System.out.println("Spanish names");
    printNumbers(mapper, 17);
  }

  private static void printNumbers(Mapping mapper, int n) {
    for(int i=0; i<n; i++) {
      System.out.printf("The value of %s is %s.%n",
                        i, mapper.wordForNumber(i));
    }
  }
}