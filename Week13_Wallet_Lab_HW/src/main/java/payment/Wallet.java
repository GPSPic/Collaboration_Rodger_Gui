package payment;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Chargeable> chargeables;
    private Chargeable selectedChargeable;

    public Wallet() {
        this.chargeables = new ArrayList<>();
        this.selectedChargeable = null;
    }

    public ArrayList<Chargeable> getChargeables() {
        return chargeables;
    }

    public Chargeable getSelectedChargeable() {
        return selectedChargeable;
    }

    public void setSelectedChargeable(Chargeable chargeable) {
        if (this.chargeables.contains(chargeable)) {
            this.selectedChargeable = chargeable;
        }
    }

    public void addCardsToWallet(Chargeable chargeable){
        this.chargeables.add(chargeable);
    }

    public void pay(double price, Chargeable chargeable) {
        chargeable.charge(price);
    }
}
