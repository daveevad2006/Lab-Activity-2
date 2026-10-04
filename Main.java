public class Main {

    public static void main(String[] args) {
    
       Vehicle vehicle1 = new Vehicle("Hyundai", "Tucson", 2015);    
       Vehicle vehicle2 = new Vehicle("Mitshubishi", "Montero", 2018);
       Vehicle vehicle3 = new Vehicle("Nissan", "Sentra", 1990);
    
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
    