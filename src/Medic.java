public class Medic extends  Hero{
    public int healPoint;
    @Override
    public void applySuperAbility() {

    }
    void increaseExperience (){
        healPoint+=(int)(healPoint*0.1);
    }

    public int getHealPoint() {
        return healPoint;
    }

    public Medic (){
        super( 80, 40,"treat");
        this.healPoint=30;
        System.out.println("Medic применил суперспособность"+superPower);

    }
}