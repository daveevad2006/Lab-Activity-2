public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Hyundai", "Tucson", 2015);    
        Vehicle vehicle2 = new Vehicle("Mitshubishi", "Montero", 2030);
        Vehicle vehicle3 = new Vehicle("Nissan", "Sentra", 1990);

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        vehicle1.setYear(2079);

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        vehicle2.setYear(2025);

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        vehicle3.setYear(2023);
    }
}