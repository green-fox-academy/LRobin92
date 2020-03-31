package aircraft;
// F35
//Max ammo: 12
//Base damage: 50
//All aircrafts should be created with an empty ammo storage
public class F35 extends  Aircrafts{

    public F35(){
        setName("F35");
        super.baseDamage = 30;
        super.maxAmmo = 8;
        super.isPriority = true;
        super.currentAmmo = 0;
    }
    @Override
    public String getStatus(){
        return "Type : "+super.name +" Ammo: " + super.currentAmmo + " Base damage: " + super.baseDamage + " All damage: " + super.currentAmmo*super.baseDamage;
    }

}
