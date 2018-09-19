package qt07_observer;

public class PoliciaObserver extends Observer{

    public PoliciaObserver(Alarme alarme){
        this.alarme = alarme;
        this.alarme.add(this);
    }

    public void update(){
        System.out.println(" Policia Observando...");
    }
}
