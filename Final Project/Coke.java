package finalf;

public class Coke implements Drink{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "A can of the classic, is there anything better?";
	}
	
	public String dietDescription() {
		return "A can of the classic with none of the calories";
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return " gulp......Yup that's the classic";
	}
	public String drinkDiet() {
		return " gulp.......Yup that sucks"; 
	}

}
