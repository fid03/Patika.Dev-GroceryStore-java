package patikaDev;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        double pricePear=2.14;
        double priceApple=3.67;
        double priceTomato=1.11;
        double priceBanana=0.95;
        double priceEggplant=5.0;
        double totalPrice;
        double kgPear,kgApple,kgTomato,kgBanana,kgEggplant;

        Scanner sc=new Scanner(System.in);
        System.out.print("KG-pear? :");
        kgPear=sc.nextDouble();

        System.out.print("KG-apple? :");
        kgApple=sc.nextDouble();

        System.out.print("KG-tomato? :");
        kgTomato=sc.nextDouble();

        System.out.print("KG-banana? :");
        kgBanana=sc.nextDouble();

        System.out.print("KG-eggplant? :");
        kgEggplant=sc.nextDouble();

        totalPrice=(pricePear*kgPear)+(priceApple*kgApple)+(priceTomato*kgTomato)+(priceBanana*kgBanana)+(priceEggplant*kgEggplant);
        System.out.println("Total Price:"+totalPrice);

    }
}
