import observers.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

class Journal {
    private static ArrayList<Observer> observers = new ArrayList<>();

    private static int date;


    // Méthode pour ajouter un observateur au journal
    public static void addObserver(Observer observer) {
        observers.add(observer);
    }
    public static void run() {
        while (true) {
            System.out.println("Quel jour du mois sommes-nous?");
            int date = new Scanner(System.in).nextInt();
            if (date > 10) {
                notifyNextIssue();}
            else {
                String name = "";
                System.out.println("Cher client, le prochain numéro du journal n'est pas encore sorti! Encore un peu de patience!");
            }
        }
    }

    private static void notifyNextIssue() {
        for (Observer observer : observers) {
            Observable Journal = new Observable();
            observer.update(Journal, date);
            System.out.println("Cher client,le nouveau numéro du journal est sorti. Il est actuellement en cours de livraison et vous recevrez un mail de confirmation à l'adresse que vous nous avez communiqué lors de votre inscription. Merci de votre confiance et à bientôt!");
        }
    }
    // Méthode pour notifier tous les observateurs à la sortie du prochain numéro

    public static void addObserver(ClientA clientA) {
        observers.add((Observer) clientA);
    }

    public static void addObserver(ClientB clientB) {
        observers.add((Observer) clientB);
    }

    public static void addObserver(ClientC clientC) {
        observers.add((Observer) clientC);
    }

    public static void addObserver(ClientD clientD) {
            observers.add((Observer) clientD);
    }

    public static void addObserver(ClientE clientE) {
        observers.add((Observer) clientE);
    }
}