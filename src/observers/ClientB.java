package observers;

import java.util.Observable;
import java.util.Observer;

public class ClientB implements Observer {
    private String name;

    public ClientB(String name) {
        this.name = name;
    }

    // Méthode appelée lorsqu'un nouveau numéro sort
    // à l'observateur
    @Override
    public void update(Observable o, Object arg) {
        int date = (int) arg;
        if (date > 10) {
            notifyNextIssue();
        }

    }
    public void notifyNextIssue() {
        System.out.println("Cher client,le nouveau numéro du journal est sorti. Il est actuellement en cours de livraison et vous recevrez un mail de confirmation à l'adresse que vous nous avez communiqué lors de votre inscription. Merci de votre confiance et à bientôt!");
    }
}

