package accesstatic;

public class Main {
  
  public static void main(String[] args) {
    //folosire directa, nu am contruit o instanta de Acces
    System.out.println("Accesul static se face de forma Clasa.membru: " +
             Acces.accesStatic);
    
    //cream o instanta pt a putea apela proprietatea
    Acces instanta = new Acces();
    System.out.println("Accesul non static are nevoie de un obiect " +
            "(instanta) si se face de forma obiect.membru: " +
            instanta.accesNonStatic);
  }
}
