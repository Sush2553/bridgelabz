package com.oops;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * @author Sushant Patwari
 * @since  10/02/2019
 * @aim to display inventory data fron JSON file
 */

public class InventoryManagement {

	public static void getData(String readFor, String arg1, String arg2, String arg3) {
		JSONParser parser = new JSONParser();
		try {
			// parse file
			Object obj = parser.parse(
					new FileReader("/home/admin1/Desktop/pre-felloship-programs/week4/src/com/oops/Inventory.txt"));
			JSONObject jsonObject = (JSONObject) obj; //convert file data into json object
			JSONArray values = (JSONArray) jsonObject.get(readFor); //read details into json array
			System.out.println("\n" + readFor + " details............");

			for (int i = 0; i < values.size(); i++) {
				//display data
				JSONObject rice = (JSONObject) values.get(i);
				String name = (String) rice.get(arg1);
				String we = (String) rice.get(arg2);
				String prize = (String) rice.get(arg3);
				System.out.println(
						(i + 1) + "--> " + arg1 + ":" + name + ", " + arg2 + ":" + we + ", " + arg3 + ":" + prize);
				int a = Integer.parseInt(we);
				int b = Integer.parseInt(prize);
				System.out.println("\tTotal Prize:" + a * b); //dispaly total prize for shares
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData("Rice", "Ricename", "Weight", "Price");
		getData("Wheat", "Wheatname", "Weight", "Price");
		getData("Pulses", "Pulsesname", "Weight", "Price");
	}
}
