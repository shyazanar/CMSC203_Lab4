/**
 * 
 * The purpose of this class is to model a television
 * Shyazana Rahaman 09/26/2020
 *
 */
public class Television {
	// The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant.
	private static String MANUFACTURER;
	// The screenSize attribute will hold the size of the television screen.
	private static int SCREEN_SIZE;
	// The powerOn attribute will hold the value true if the power is on, and false if the power is off.
	private boolean powerOn = false;
	// The channel attribute will hold the value of the station that the television is showing.
	private int channel = 0;
	// The volume attribute will hold a number value representing the loudness (0 being no sound).
	private int volume = 20;
	
	/**
	 * Constructor that takes data as input and sets them.
	 * @param brand
	 * @param size
	 */
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	/**
	 * The method will store the desired station in the channel field.
	 * @param station
	 */
	public void setChannel(int station)
	{
		this.channel = station;
	}
	
	/**
	 * This method will toggle the power between on and off, 
	 * changing the value stored in the powerOn field from true to false 
	 * or from false to true
	 */
	public void power()
	{
		this.powerOn = !this.powerOn;
	}
	
	/**
	 * This method will increase the value stored in the volume field by 1.
	 */
	public void increaseVolume()
	{
		this.volume++;
	}
	
	/**
	 * This method will decrease the value stored in the volume field by 1.
	 */
	public void decreaseVolume()
	{
		this.volume--;
	}
	
	/**
	 * This method will:
	 * @return the value stored in the channel field.
	 */
	public int getChannel()
	{
		return this.channel;
	}
	
	/**
	 * This method will:
	 * @return return the value stored in the volume field.
	 */
	public int getVolume()
	{
		return this.volume;
	}
	
	/**
	 * This method will: 
	 * @return the constant value stored in the MANUFACTURER field.
	 */
	public String getManufacturer()
	{
		return Television.MANUFACTURER;
	}
	
	/**
	 * This method will: 
	 * @return the constant value stored in the SCREEN_SIZE field.
	 */
	public int getScreenSize()
	{
		return Television.SCREEN_SIZE;
	}

}
