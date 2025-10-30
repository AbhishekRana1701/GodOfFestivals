public class Lab {
    public void practical() {
        
        String str = "My University is the Best University";
        
        
        String upperCaseStr = str.toUpperCase();
        System.out.println("All alphabets to Upper Case: " + upperCaseStr);
        
        
        String lowerCaseStr = str.toLowerCase();
        System.out.println("All alphabets to Lower Case: " + lowerCaseStr);
        
      
        int countE = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                countE++;
            }
        }
        System.out.println("Number of times 'e' has occurred: " + countE);
        
       
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);
    }
    
    public static void main(String[] args) {
       
        Lab l = new Lab();
        
        
        l.practical();
    }
}