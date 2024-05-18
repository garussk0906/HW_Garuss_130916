package Timus2Sem.task_1607;

import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        new Main().solve();
    }

    private void solve(){
        int petrOffer = this.in.nextInt();
        int petrRate = this.in.nextInt();
        int driverOffer = this.in.nextInt();
        int driverRate = this.in.nextInt();
        int finalPrice;
        while(true){
            if (petrOffer>=driverOffer){
                finalPrice = petrOffer;
                break;
            }
            if (petrOffer+petrRate>=driverOffer){
                finalPrice = driverOffer;
                break;
            }else{
                petrOffer+=petrRate;
            }

            if (driverOffer-driverRate<=petrOffer){
                finalPrice = petrOffer;
                break;
            }else{
                driverOffer-=driverRate;
            }
        }

        System.out.println(finalPrice);

    }
}