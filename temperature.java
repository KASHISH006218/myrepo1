public class Main{
    public static void main(String[] args) {
        Temperature temp =  new Temperature (25.0);

        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());

        }
    }



public class Temperature {
    private double celsius;

public Temperature (double celsius ){
    this.celsius = celsius;
}
public double getFahrahiet(){
    return ( celsius * 9/ 5)+32;
}
}
