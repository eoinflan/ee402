package EE402;
import EE402.*;


import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.Date;



public class TempReader implements TempClientInterface {
	
	private int id;
	private String timestamp;
	private String temp;
	private int sampleRate; 
	private TempClientInterface app;
	private Client theClientApp; 
	
	
	//public TempReader(TempClientInterface app) {
	public TempReader(TempClientInterface app) {

		this.app = app; 
	// 	this.theClientApp = this;
		this.getTemp();
		System.out.println(temp);
		//this.app.getDate();

	//	app.sendTemp(this.getTemp());

		
	 
	}
	
	String getTemp() {
		
		File file = new File("/Users/eoinmachd/Desktop/FakeTempRead.txt");
		String tempFileName = "/Users/eoinmachd/Desktop/FakeTempRead.txt";
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("/Users/eoinmachd/Desktop/FakeTempRead.txt"));
		}		
		catch (FileNotFoundException e) {e.printStackTrace();}
		
		try {			
			temp = in.readLine();
		}
		catch (IOException e) {e.printStackTrace();}
		  
	//	System.out.println(temp);
		return temp;

	}
	

//	
//    public static void main(String args[]) 
//    {
//    	
//    //	new TempReader();
//
//    }
//	
	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new TempReader();
//		
//	}





}
