package fitness_calc;

public abstract class Calc {
    private double nutrientPercentage;
    private double nutrientCalorie;
    Calc(double nutrientPercentage, double nutrientCalorie){
        this.nutrientPercentage=nutrientPercentage;
        this.nutrientCalorie=nutrientCalorie;
        }
    public double Calculate(double h, double w, int age, String sex, int activity, String goal) {
        double calories;
        if (sex=="Мужской") {
            calories = 66.5 + 13.75*w + 5.003*h - 6.775*age;
        }
        else {
            calories = 655.1 + 9.563*w + 1.85*h - 4.676*age;
        }
        if (goal=="Набор массы") {
            calories=1.1;
        }
        if (goal=="Снижение веса") {
            calories=0.9;
        }
        switch (activity) {
        case 1:
            calories=1.2;
            break;
        case 2:
            calories=1.375;
            break;
        case 3:
            calories=1.55;
            break;
        case 4:
            calories=1.7;
            break;
        case 5:
            calories=1.9;
            break;
        }
        return calories*nutrientPercentage/nutrientCalorie;
    }
}
