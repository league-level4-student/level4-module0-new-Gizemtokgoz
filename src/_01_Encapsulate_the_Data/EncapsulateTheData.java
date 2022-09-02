package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	/*
	 * itemsReceived cannot be negative. All negative parameters should set
	 * itemsReceived to 0.
	 */
	private int itemsReceived;

	public int getItemsReceived() {
		return itemsReceived;

	}

	public void setItemsReceived(int newValue) {
		if (newValue < 0) {
			itemsReceived = 0;
		}
		
		if (newValue > 0) {
			itemsReceived = newValue;
		}
	}

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive. All parameters
	 * outside this range should set degreesTurned to the nearest bound.
	 */

	private Double degreesTurned;

	public Double getDegreesTurned() {
		return degreesTurned;

	}

	public void setDegreesTurned(Double rpm) {
		if (rpm < 0) {
			degreesTurned = 0.0;
		}
				
		if (rpm > 360) {
			degreesTurned = 360.0;
		}
		
		if (rpm >= 0 && rpm <= 360) {
			degreesTurned = rpm;
		}
	}

	/*
	 * nomenclature must not contain an empty String. An empty String parameter
	 * should set nomenclature to a String with a single space.
	 */

	private String nomenclature;

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String ranst) {
		String empt = " ";
		ranst.trim();
		if (ranst.length() < 1) {
			nomenclature = empt;
		}
		
		else {
			nomenclature = ranst;
		}

	}

}
