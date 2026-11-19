package chaining;

public class vehical {
    String name ;
    double price;
    int speed;


    vehical(){

    }
     vehical(int speed){
        this .speed=speed;

    }
    public  vehical setName(String name){
        this.name=name;
        return this;
    } 
     public  vehical setSpeed(int speed){
        this.speed=speed;
        return this;
    }
      public  vehical setPrice(double price){
        this.price=price;
        return this;
    }
    public  String toString(){
        return "vehical name is "+name+" car speed is "+speed+" car price is "+price;
    }

    
}
