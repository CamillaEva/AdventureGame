public class Food extends Item {

    private int healthPoints;


    public Food(String food, String foodDescription, int healthPoints){
        super(food,foodDescription);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return healthPoints;
    }






}
