// Interface in Java 8 with default method
public interface Languages {
	void html();
	void css();
	void javaScript();
	default void msg() {
		System.out.println("Notepad can be used as default for witing code."); //Default Method
	}
}
class WebDevelopment implements Languages{  
	public void html(){
		System.out.println("HTML is used for developing WebPages");
	}  
	public void css(){
		System.out.println("CSS is used for styling webpages");
	}
	public void javaScript(){
		System.out.println("JavaScript is used for performing operations on the webpage");
	}
}  
class Testing{  
	public static void main(String args[]){  
		Languages w =new WebDevelopment();  
		w.html();  
		w.css();
		w.javaScript();
}}

//Output
/*
HTML is used for developing WebPages
CSS is used for styling webpages
JavaScript is used for performing operations on the webpage
*/
