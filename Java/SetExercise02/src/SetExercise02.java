import java.time.Duration;
import java.time.Instant;
import java.util.Random;

	public class SetExercise02 {

	    private static Instant start;
	    
	    public static void main(String[] args) {
			System.out.print("Starting measuring Set add operation: ");
			startMeasurement();
			runSetAddTest();
			stopMeasurement();
			System.out.println("");
			
			System.out.print("Starting measuring Set contains operation: ");
			startMeasurement();
			runSetContainsTest();
			stopMeasurement();
			System.out.println("");

			System.out.print("Starting measuring List add operations: ");
			startMeasurement();
			runListAddTest();
			stopMeasurement();
			System.out.println("");
			
			System.out.print("Starting measuring List contains operation: ");
			startMeasurement();
			runListContainsTest();
			stopMeasurement();
			System.out.println("");
		}

	    private static void runSetAddTest() {
			Random rand = new Random();
			set = new HashSet();
			for(int i = 0; i < 10000; i++)
			{
				Integer integer = rand.nextInt(10000);
				set.add(integer);
			}
			
		}

		private static void runSetContainsTest() {
			Random rand = new Random();
			for(int i=0; i<10000; i++)
			{
				Integer integer = rand.nextInt(10000);
				list.contains(integer);
			}
			
		}

		private static void runListContainsTest() {
			// TODO Auto-generated method stub
			
		}

		private static void runListAddTest() {
			Random rand = new Random();
			list = new ArrayList();
			for(int i = 0; i < 10000; i++)
			{
				Integer integer = rand.nextInt(10000);
				set.add(integer);
			}
			
		}

		private static void startMeasurement() {
	        start = Instant.now();
	    }

	    private static void stopMeasurement() {
	        Instant stop = Instant.now();
	        System.out.println(Duration.between(start, stop));
	    }
	}
