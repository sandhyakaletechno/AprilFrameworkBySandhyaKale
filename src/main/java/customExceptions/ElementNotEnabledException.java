package customExceptions;

public class ElementNotEnabledException extends RuntimeException{
	
	private String message;
	
	
	public ElementNotEnabledException(String message){
		this.message= message;
		
	}
	
	public String toString(){
		//override toString method here
		//if we dont use this then 
		return message;
	
	//return "maulik";
	}
	
	public static void main(String[] args){
		try{
			throw new ElementNotEnabledException("Element is not visible");
			
		}catch(ElementNotEnabledException e){
			System.out.println(e);
		}
	}
	
	
}
