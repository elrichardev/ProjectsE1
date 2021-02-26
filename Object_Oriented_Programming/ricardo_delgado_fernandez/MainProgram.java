package ricardo_delgado_fernandez;

public class MainProgram {

	public static void main(String[] args) {

		//CLASE MAIN

		//Creamos un barco
		Boat barco1 = new Boat(null, null, 100, 3000, 37, 5000);

		//		//Creamos tres viajeros
		Passenger pasajero1 = new Passenger("Raúl", "0343424B", 35, 76);
		Passenger pasajero2 = new Passenger("Sergio", "2342305B", 40, 56);
		Passenger pasajero3 = new Passenger("Manuel", "0234246B", 84, 93);


		//Creamos una serie de equipajes (de cada viajero)

		Package equipaje1 = new Package("Maleta de Raúl", "49B", false, 0);
		Package equipaje2 = new Package("Maleta de Sergio", "59C", false, 0);
		Package equipaje3 = new Package("Maleta de Manuel", "69D", true, 0);


		//Uso de métodos
		barco1.addPassenger(pasajero1);
		barco1.addPassenger(pasajero2);
		barco1.addPassenger(pasajero3);





	}

}
