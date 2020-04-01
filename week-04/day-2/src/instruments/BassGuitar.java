package instruments;

public class BassGuitar extends StringedInstrument{
    public BassGuitar(){
        super.name = "Bass Guitar";
        super.numberOfStrings = 4;
    }
    public BassGuitar(int numberOfStrings){
        super.numberOfStrings = numberOfStrings;
        super.name = "Bass Guitar";
    }
    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
    @Override
    public void play(){
        System.out.println(this.name + ", is a "+ this.numberOfStrings+ " stringed instrument that goes "+ sound());
    }
}
