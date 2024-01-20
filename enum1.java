//In Java, an enum (enumeration) is a special data type that is used to define a fixed set of constant values. Enumerations are often used to represent a set of related named constants. cant extennd enum
// enum Status{
//     Running, Failed, Pending, Success; //name constants
// }
enum Lap{
    Macbook(2000), Asus;
    private int price;
    private Lap(int price){
        this.price = price;
    }
    private Lap() {
        price=500;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

}





public class enum1 {
    public static void main(String[] args) {
        int i =5;
        // Status s = Status.Running;
        // Lap x = Lap.Macbook;
        // System.out.println(x.getPrice());
        for(Lap lap : Lap.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
