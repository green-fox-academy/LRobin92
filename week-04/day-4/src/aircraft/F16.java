package aircraft;

public class F16 extends Aircrafts{
    //F16
    //Max ammo: 8
    //Base damage: 30
    public F16() {
        setName("F16");
        super.baseDamage = 30;
        super.maxAmmo = 8;
        super.isPriority = false;
        super.currentAmmo = 0;
    }
    @Override
    public String getStatus(){
        return "Type : "+super.name +" Ammo: " + super.currentAmmo + " Base damage: " + super.baseDamage + " All damage: " + super.currentAmmo*super.baseDamage;
    }
}


