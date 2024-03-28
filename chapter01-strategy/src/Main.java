public class Main {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n ");

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();



System.out.println("\n");
// Buat objek Calculator dengan strategi penambahan
Calculator calculator = new Calculator(new Addition());

// Lakukan operasi matematika dengan strategi yang ditetapkan
int result1 = calculator.executeStrategy(5, 3);
                System.out.println("5 + 3 = " + result1);

// Ubah strategi menjadi pengurangan
                calculator.setStrategy(new Subtraction());

// Lakukan operasi matematika lagi dengan strategi pengurangan
int result2 = calculator.executeStrategy(8, 2);
                System.out.println("8 - 2 = " + result2);

// Ubah strategi menjadi perkalian
                calculator.setStrategy(new Multiplication());

// Lakukan operasi matematika lagi dengan strategi perkalian
int result3 = calculator.executeStrategy(4, 6);
                System.out.println("4 * 6 = " + result3);

// Ubah strategi menjadi pembagian
                calculator.setStrategy(new Division());

// Lakukan operasi matematika lagi dengan strategi pembagian
int result4 = calculator.executeStrategy(10, 2);
                System.out.println("10 / 2 = " + result4);
            }
                    }

