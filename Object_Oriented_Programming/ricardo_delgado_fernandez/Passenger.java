package ricardo_delgado_fernandez;
//CLASE FINALIZADA
public class Passenger {
	
	//ATRIBUTOS PRINCIPALES DE LA CLASE
	private String name;
	private String id;
	private int age;
	private float weight;
	
	//CONSTRUCTOR DE LA CLASE
	/**
	 * @param name
	 * @param id
	 * @param age
	 * @param weight
	 */
	
	public Passenger(String name, String id, int age, float weight) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
	}

	public Passenger(String name2, String id2, int age2, int weight2) {
		// TODO Auto-generated constructor stub
	}

	//GETTERS Y SETTERS DE LA CLASE
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}	
}
