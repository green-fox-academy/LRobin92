package instruments;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar(){
        super.name = "Electric Guitar";
        super.numberOfStrings = 6;
    }
    public ElectricGuitar(int numberOfStrings){
        super.numberOfStrings = numberOfStrings;
        super.name = "Electric Guitar";
    }
    @Override
    public String sound() {
        return "Twang";
    }
    @Override
    public void play(){
        System.out.println(this.name + ", is a "+ this.numberOfStrings+ " stringed instrument that goes "+ sound());
    }
}
