package main;

public class Application {

	public static void main(String[] args) {

		Tesla modelS = new Tesla("model s", "advanced navgiational technologies", 
		"Touch screen dashboard", 335, 155, 4);	
		
		String MyHotCar = modelS.getAutopilot();
		
		System.out.println(MyHotCar.length());
		System.out.println(MyHotCar.toUpperCase());
		System.out.println(MyHotCar.substring(5));
		System.out.println(MyHotCar.toLowerCase());
		System.out.println(MyHotCar.charAt(8));
		System.out.println(MyHotCar.substring(0, 15));
		System.out.println(MyHotCar.substring(7, 22));
		System.out.println(MyHotCar.isEmpty());
		System.out.println(MyHotCar.compareTo(MyHotCar));
		System.out.println(MyHotCar.trim());
		System.out.println(MyHotCar.endsWith("335"));
		System.out.println(MyHotCar.endsWith("onal"));
		System.out.println(MyHotCar.indexOf('d'));
		System.out.println(MyHotCar.indexOf("screen"));
		System.out.println(MyHotCar.isEmpty());
		System.out.println(MyHotCar.contains("touch"));               
		System.out.println(MyHotCar.contains("advanced"));            
		System.out.println(MyHotCar.replace("Model S", "Model X"));
		System.out.println(MyHotCar.intern());
		System.out.println(MyHotCar.toCharArray());
		System.out.println(MyHotCar.indexOf('s', 355));
		System.out.println(MyHotCar.lastIndexOf("technologies"));
		System.out.println(MyHotCar.codePointAt(0));
		System.out.println(MyHotCar.replace('s', 'x'));
		System.out.println(MyHotCar.replace('s', 'm'));
		System.out.println(MyHotCar.contains("s"));                  
		System.out.println(MyHotCar.getClass());
		System.out.println(MyHotCar.startsWith("dashboard"));
		
				
	}

}