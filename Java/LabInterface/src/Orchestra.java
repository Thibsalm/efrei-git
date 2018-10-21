import java.util.ArrayList;
import java.util.List;

public class Orchestra implements Instrument{
	private List<Instrument> instruments = new ArrayList();
	
	public void addInstrument(Instrument instrument) {
		instruments.add(instrument);
	}

	public void play () {
		for(int i=0; i<20; i++)
		{
			for(Instrument instrument : instruments)
			{
				instrument.play();
			}
		}

	}

}
