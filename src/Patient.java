package hospital;

public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhone;

	public Patient() {
	}

	/**
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param phoneNumber
	 * @param emergencyName
	 * @param emergencyPhone
	 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
			String state, String zipCode, String phoneNumber, String emergencyName, String emergencyPhone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @return
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @return
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @return
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmergencyName() {
		return emergencyName;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @param middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param streetAddress
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 * @param emergencyName
	 */
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	/**
	 * 
	 * @param emergencyPhone
	 */
	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	/**
	 * 
	 * @return
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	/**
	 * 
	 * @return
	 */
	public String buildAddress() {
		return streetAddress + ", " + city + ", " + state + " " + zipCode;
	}

	/**
	 * 
	 * @return
	 */
	public String buildEmergencyContact() {
		return emergencyName + " (" + emergencyPhone + ")";
	}

	/**
	 * 
	 */
	public String toString() {
		return "Patient Information:\n" + "Full Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n"
				+ "Phone: " + phoneNumber + "\n" + "Emergency Contact: " + buildEmergencyContact();
	}
}
