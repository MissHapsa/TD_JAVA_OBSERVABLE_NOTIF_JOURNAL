import observers.ClientA;
import observers.ClientB;
import observers.ClientC;
import observers.ClientD;
import observers.ClientE;



public class Main {


    public static void main(String[] args) {
        ClientA clientA = new ClientA("A");
        ClientB clientB = new ClientB("B");
        ClientC clientC = new ClientC("C");
        ClientD clientD = new ClientD("D");
        ClientE clientE = new ClientE("E");

        Journal.addObserver(clientA);

        Journal.addObserver(clientB);
        Journal.addObserver(clientC);
        Journal.addObserver(clientD);
        Journal.addObserver(clientE);
        Journal.run();
    }
}
