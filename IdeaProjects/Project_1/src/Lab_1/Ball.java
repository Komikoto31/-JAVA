package Lab_1;

import java.lang.*;
public class Ball {
    private String Color;
    private int Weight;
    public Ball(String s, int w) {
        Color = s;
        Weight = w;
    }
    public Ball(String s){
        Color = s;
        Weight = 0;
    }
    public Ball(){
        Color = "Pup";
        Weight = 0;
    }

    public void setWeight(int Weight) {this.Weight = Weight;}
    public void setColor(String Color) {
        this.Color = Color;
    }
    public String getColor(String Color){
        return Color;
    }
    public int getWeight() {
        return Weight;
    }
    @Override
    public String toString(){
        return this.Color+", weight "+this.Weight;
    }
    public void intoKilogram(){
        System.out.println("Weight of the "+Color+" ball in kilograms: "+Weight/1000);
    }
}
