package strings;

public class Main {

	public static void main(String[] args) {
		
	String message = "Bugün hava çok güzel.";
	System.out.println(message);
	System.out.println("Eleman sayısı : " + message.length());
	System.out.println("5. eleman : " + message.charAt(4));
	System.out.println(message.concat(" Yaşasın!")); 	
	System.out.println(message);						
	System.out.println(message.startsWith("B"));		
	System.out.println(message.endsWith("B"));			
	char[] characters = new char[5];
	message.getChars(0,5,characters,0); 				
	System.out.println(characters); 					
	System.out.println(message.indexOf("av")); 			
	System.out.println(message.lastIndexOf('a')); 																
	System.out.println("--------------------------------------");
	String newMessage = message.replace(' ','-');		
	System.out.println(newMessage); 					
	System.out.println(message.replace(' ','-'));		 
	System.out.println(message.substring(2));			
	System.out.println(message.substring(2,4)); 			
	for(String word : message.split(" ")){System.out.println(word);}
	System.out.println(message.toLowerCase());			
	System.out.println(message.toUpperCase());																	
	System.out.println(message.trim()); 		
	}
}
