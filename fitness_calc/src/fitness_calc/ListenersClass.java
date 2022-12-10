package fitness_calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenersClass {
	Main w;
	ListenersClass(Main w){
		this.w=w;
	}
	    public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    public class ListenerCalculate implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	        	float height = 0;
	        	w.output.setText("");
	        	boolean flag = true;
	        	try {
	                height = Float.parseFloat(w.input1.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText("Неверно задан рост");
	            }
	        	float weight = 0;
	        	try {
	                weight = Float.parseFloat(w.input2.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText(w.output.getText()+"\n"+"Неверно задан вес");
	            }
	        	int age = 0;
	        	try {
	                age = Integer.parseInt(w.input3.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText(w.output.getText()+"\n"+"Неверно задан возраст");
	            }
	        	
	        	if (flag) {
	        	Proteins protein=new Proteins();
	        	Fats fat=new Fats();
	        	Carbs carb=new Carbs();
	        	CalorieIntake calories=new CalorieIntake();
	        	String sex = w.menu2.getSelectedItem().toString();
	        	Integer type = Integer.parseInt(w.menu3.getSelectedItem().toString());
	        	String goal = w.menu1.getSelectedItem().toString();

	        	Double protein_g = protein.Calculate(height,weight,age,sex,type,goal);
	        	Double fat_g= fat.Calculate(height,weight,age,sex,type,goal);
	        	Double carb_g = carb.Calculate(height,weight,age,sex,type,goal);
	        	Double caloriNew = calories.Calculate(height, weight, age, sex, type, goal);

	        	String template = "Белки: %.0f грамм\nЖиры: %.0f грамм\nУглеводы %.0f грамм\nКалории: %.0f ккал\n";
	        	
	        	w.output.setText(String.format(template, protein_g, fat_g, carb_g, caloriNew));
	        	}
	        }
	    }
}
