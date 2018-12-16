package EE402;
//import ee402.*;


import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.Date;

//public class TempReader implements TempClientInterface {


public class TempReader  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int id = 0;
	private String timestamp;
	private static String temp;
	private int sampleRate; 
	private TempClientInterface app;
	private Client theClientApp; 
	private String getTemp;
	
	
	public TempReader() {}
	
	public TempReader(String getTemp, int id,String temp) {
		this.getTemp = "GetTemp";
		this.id = id;
	//	this.id = id + 1;
		this.temp = temp;
	//	this.temp = this.getTemp();
	}
	
//	public TempReader(String temp) { 
//		this.temp = temp;
//		this.temp = this.getTemp();
//	}

	public TempReader(String timestamp) {}
	
	public static int getID() {
		return id = id + 1;
	}
	
	
	
	//public TempReader(TempClientInterface app) {
	public TempReader(TempClientInterface app) {

		this.app = app; 
	// 	this.theClientApp = this;
		this.getTemp();
		System.out.println(temp);
		//this.app.getDate();

	//	app.sendTemp(this.getTemp());

		
	 
	}
	
	protected static  String getTemp() {
		
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



////package EE402;
////import EE402.*;
//
//
//import java.io.*;
//import java.net.*;
//import java.util.Calendar;
//import java.util.Date;
//
////public class TempReader implements TempClientInterface {
//
//
//public class TempReader implements Serializable  {
//	
////	private int id;
////	private String timestamp;
//	private String temp;
////	private int sampleRate; 
//	private TempClientInterface app;
////	private Client theClientApp; 
//	
//	
//	//public TempReader(TempClientInterface app) {
//	public TempReader(TempClientInterface app) {
//
//		this.app = app; 
//	// 	this.theClientApp = this;
//		this.getTemp();
//		System.out.println(temp);
//		//this.app.getDate();
//
//	//	app.sendTemp(this.getTemp());
//
//		
//	 
//	}
//	
//	public TempReader() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public String getTemp() {
//		
//		File file = new File("/Users/eoinmachd/Desktop/FakeTempRead.txt");
//		String tempFileName = "/Users/eoinmachd/Desktop/FakeTempRead.txt";
//		
//		BufferedReader in = null;
//		try {
//			in = new BufferedReader(new FileReader("/Users/eoinmachd/Desktop/FakeTempRead.txt"));
//		}		
//		catch (FileNotFoundException e) {e.printStackTrace();}
//		
//		try {			
//			temp = in.readLine();
//		}
//		catch (IOException e) {e.printStackTrace();}
//		  
//	//	System.out.println(temp);
//		return temp;
//
//	}
//	
//
////	
////    public static void main(String args[]) 
////    {
////    	
////    //	new TempReader();
////
////    }
////	
//	
////
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		new TempReader();
////		
////	}
//
//
//
//
//
//}
