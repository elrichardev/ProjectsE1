package ricardo_delgado_fernandez;

import java.util.Vector;

public class Boat{
	
	//ATRIBUTOS PRINCIPALES DE LA CLASE
	private Vector<Package> cargo;
	private Vector<Passenger> passengers;
	private Passenger captain;
	private float numberSeats;
	private float maximunLoadWeight;
	private float tiketPrice;
	private float cargoKilogramRatePrice;
	
	//CONSTRUCTOR DE LA CLASE
	/**
	 * @param passengers
	 * @param captain
	 * @param numberSeats
	 * @param maximunLoadWeight
	 * @param tiketPrice
	 * @param cargoKilogramRatePrice
	 */
	
	public Boat(Vector<Passenger> passengers, Passenger captain, float numberSeats, float maximunLoadWeight,
			float tiketPrice, float cargoKilogramRatePrice) {
		super();
		this.passengers = passengers;
		this.captain = captain;
		this.numberSeats = 100;
		this.maximunLoadWeight = maximunLoadWeight;
		this.tiketPrice = tiketPrice;
		this.cargoKilogramRatePrice = cargoKilogramRatePrice;
	}
	
	//GETTERS Y SETTERS DE LA CLASE
	/**
	 * @return the passengers
	 */
	public Vector<Passenger> getPassengers() {
		return passengers;
	}

	/**
	 * @param passengers the passengers to set
	 */
	public void setPassengers(Vector<Passenger> passengers) {
		this.passengers = passengers;
	}

	/**
	 * @return the captain
	 */
	public Passenger getCaptain() {
		return captain;
	}

	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(Passenger captain) {
		this.captain = captain;
	}

	/**
	 * @return the numberSeats
	 */
	public float getNumberSeats() {
		return numberSeats;
	}

	/**
	 * @param numberSeats the numberSeats to set
	 */
	public void setNumberSeats(float numberSeats) {
		this.numberSeats = numberSeats;
	}

	/**
	 * @return the maximunLoadWeight
	 */
	public float getMaximunLoadWeight() {
		return maximunLoadWeight;
	}

	/**
	 * @param maximunLoadWeight the maximunLoadWeight to set
	 */
	public void setMaximunLoadWeight(float maximunLoadWeight) {
		this.maximunLoadWeight = maximunLoadWeight;
	}

	/**
	 * @return the tiketPrice
	 */
	public float getTiketPrice() {
		return tiketPrice;
	}

	/**
	 * @param tiketPrice the tiketPrice to set
	 */
	public void setTiketPrice(float tiketPrice) {
		this.tiketPrice = tiketPrice;
	}

	/**
	 * @return the cargoKilogramRatePrice
	 */
	public float getCargoKilogramRatePrice() {
		return cargoKilogramRatePrice;
	}

	/**
	 * @param cargoKilogramRatePrice the cargoKilogramRatePrice to set
	 */
	public void setCargoKilogramRatePrice(float cargoKilogramRatePrice) {
		this.cargoKilogramRatePrice = cargoKilogramRatePrice;
	}
	
	//MÉTODOS PRIMARIOS DE LA CLASE
	
	//método añadir pasajero
	public boolean addPassenger(Passenger passengers) {
		boolean añadido = true;
		
		if (this.numberSeats < 200 ) {
			this.passengers.add(passengers);
			System.out.println("Pasajero añadido!");
			
			
		}else {
			System.out.println("Error, capacidad máxima alcanzada");
			return false;
		}
		
		return añadido;
		
	}
	
	//método eliminar pasajero
	public boolean removeLastPassenger() {
		boolean eliminado = true;
		
		if (this.passengers.size() > 0) {
			this.passengers.remove(passengers);
			System.out.println("Pasajero eliminado!");
			
			
		}else {
			System.out.println("No existen pasajeros a bordo!");
			return false;
		}
		
		return eliminado;
	}
	
	//método eliminar todos los pasajeros
	public boolean removeAllPassenger() {
		boolean eliminar_todos = true;
		
		if (this.passengers.size() > 0) {
			
		while (this.passengers.size() > 0){
			this.passengers.remove(passengers);
			
		}
		}else {
			System.out.println("Ya no hay ningún pasajero!");
			return false;
		}
		
		return eliminar_todos;
	}
	
	//método añadir equipaje
	public boolean addLoad(Package cargo) {
		
		
		
		
		return false;
		
		
		
	}
	
	//método eliminar ultima carga
	public boolean removeLastLoad() {
     
		boolean eliminar_carga = true;
		
		if (this.cargo.size() > 0) {
			
		while (this.cargo.size() > 0){
			this.cargo.remove(cargo);
			
		}
		}else {
			return false;
		}
		
		return eliminar_carga;
	}
	
	//método eliminar todas las cargas
	public void removeAllLoads() {
		
		
		
	}
	
	//método calcular peso total
	public float calculateTotalWeight() {
	float peso_total = 0;
	
	
		return peso_total;
	}
	
	//método calcular Billing
	public float calculateBilling() {
		float billing = 0;
		
		return billing;
		
		
		
	}
	
	//método encontrar pasajero más joven
	public int findYoungerPassenger() {
		int edad_min = 0;
		
		
		
		return edad_min;
	}
	
	//método encontras pasajero mas viejo
	public int findOlderPassenger() {
		int edad_max = 0;
		
		return edad_max;
		
	}
	
	//método viaje peligroso
	public boolean dangerousTrip() {
		
		return false;
	}
	
}
