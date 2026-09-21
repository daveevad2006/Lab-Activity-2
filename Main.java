public class Main {

    public static void main(String[] args) {
    
       Vehicle vehicle1 = new Vehicle();
       vehicle1.brand = "Hyundai";
       vehicle1.model = "Tucson";
       vehicle1.year = 2015;
    
       Vehicle vehicle2 = new Vehicle();
       vehicle2.brand = "Mitsubishi";
       vehicle2.model = "Montero";
       vehicle2.year = 2018;
    
       Vehicle vehicle3 = new Vehicle();
       vehicle3.brand = "Nissan";
       vehicle3.model = "Sentra";
       vehicle3.year = 1990;
    
       vehicle1.displayInfo();
       System.out.println("Age: " + vehicle1.calculateAge());
    
       System.out.println("Vintage: " + vehicle1.isVintage());
    
       System.out.println();
    
       vehicle2.displayInfo();
       System.out.println("Age: " + vehicle2.calculateAge());
    
       System.out.println("Vintage: " + vehicle2.isVintage());
    
       System.out.println();
    
       vehicle3.displayInfo();
       System.out.println("Age: " + vehicle3.calculateAge());
       
       System.out.println("Age: " + vehicle3.isVintage());
       
       
   }
}
    