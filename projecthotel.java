import java.util.ArrayList;

public class projecthotel {
    public static void main(String[] args) {
        ArrayList<Hotel> personList = new ArrayList<Hotel>();
        Hotel h = new Hotel("John");
        Customer c  = new Customer("Woramet");
        Customer1 a = new Customer1("Chawanakorb");
        Customer2 b = new Customer2("Ponpan");

        personList.add(h);
        personList.add(c);
        personList.add(a);
        personList.add(b);

        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).showDetails();
        }

        
    }
}

class Hotel {
    protected String name;
    protected String email;
    protected int roomnumber;
    protected int phonenumber;
    protected String roomtype;
    protected int pricepernight;
    protected int checkin;
    protected int checkout;

    Hotel(String name) {
        this.name = name;
        this.email = "John@gmail";
        this.roomnumber = 101;
        this.phonenumber = 25555;
        this.roomtype = "Deluxe";
        this.pricepernight = 2000;
        this.checkin = 20230912;
        this.checkout = 20230913;
    }

    public void showDetails() {
        System.out.println("****************************");
        System.out.println("Name: " + name);
        System.out.println("Email: " + this.email);
        System.out.println("Roomnumber : " + this.roomnumber);
        System.out.println("PhoneNumber: " + this.phonenumber);
        System.out.println("Roomtype: " + this.roomtype);
        System.out.println("Pricepernight: " + this.pricepernight);
        System.out.println("Checkin: " + this.checkin);
        System.out.println("Checkout: " + this.checkout);
    }
}

class Customer extends Hotel {
    Customer(String name) {
        super(name);
        this.email = "woramet@";
        this.roomnumber = 102;
        this.phonenumber = 0555565;
        this.roomtype = "Standart";
        this.pricepernight = 3000;
        this.checkin = 20230921;
        this.checkout = 20230922;

    }

    
    public void showDetails() {
        super.showDetails();
    }
}

class Customer1 extends Hotel {
    Customer1(String name) {
        super(name);
        this.email = "Chawanakon@";
        this.phonenumber = 103;
        this.phonenumber = 555552;
        this.roomtype = "Standart";
        this.pricepernight = 3000;
        this.checkin = 20230921;
        this.checkout = 20230922;

    }
 
    public void showDetails() {
        super.showDetails();
    }
}

class Customer2 extends Hotel {
    Customer2(String name) {
        super(name);
        this.email = "Ponpan@";
        this.phonenumber = 104;
        this.phonenumber = 5566699;
        this.roomtype = "Standart";
        this.pricepernight = 3000;
        this.checkin = 20230921;
        this.checkout = 20230922;

    }
 
    public void showDetails() {
        super.showDetails();
    }
}

