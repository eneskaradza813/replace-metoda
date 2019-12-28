package vjzeba15;

public class Vjzeba15 {

    public static void main(String[] args) {
        
     String[] forbidenChars = {"<",">","'"};
     String input = "<div>moj 'div tag</div>";
     
     String output = input;
        for (int i = 0; i < forbidenChars.length; i++) {
            output = output.replace(forbidenChars[i], "");
            System.out.println(output);
            
        }
        

   

   
        
    }

}
