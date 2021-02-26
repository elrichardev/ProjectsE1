package ricardo_delgado_fernandez;
//CLASE FINALIZADA
public class Package {
	
	//ATRIBUTOS PRINCIPALES DE LA CLASE
	private String description;
	private String trackingNumber;
	private boolean dangerous;
	private float weight;
	
	//CONSTRUCTOR DE LA CLASE
	/**
	 * @param description
	 * @param trackingNumber
	 * @param dangerous
	 * @param weight
	 */
	public Package(String description, String trackingNumber, boolean dangerous, float weight) {
		super();
		this.description = description;
		this.trackingNumber = trackingNumber;
		this.dangerous = dangerous;
		this.weight = weight;
	}
	
	//GETTERS Y SETTERS DE LA CLASE
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 * @return the dangerous
	 */
	public boolean isDangerous() {
		return dangerous;
	}

	/**
	 * @param dangerous the dangerous to set
	 */
	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
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
