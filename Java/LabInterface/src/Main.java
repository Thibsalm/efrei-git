
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument flute = new Flute();
		Instrument guitar = new Guitar();
		Instrument trombone = new Trombone();
		/*flute.play();
		guitar.play();
		trombone.play();*/
		Orchestra orchestra = new Orchestra();
		orchestra.addInstrument(flute);
		orchestra.addInstrument(guitar);
		orchestra.addInstrument(trombone);
		orchestra.play();
		

	}

}
