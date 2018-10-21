import java.util.*;
import java.util.List;
import java.util.Arrays;

public abstract class Vehicle {
	
	String modelName = "undefined";
	
	public String getModelName() {
		return modelName;
	}
}

public class Car extends Vehicle {
	
	public Car(String modelName) {
		this.modelName = modelName;
	}
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Peugeot 306");
		System.out.println(car.getModelName());
	}

}