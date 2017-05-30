package moduli;

public class CopyFizzBuzzCat
{
    public static void main (String[] args)
    {
    int count=1;
    String str="";
    
    
    while(count<=10){
    	if (count%2==0){
            str=str+"Copy";
            }
    	
        if (count%3==0){
             str=str+"Fizz";
                }

        if (count%5==0){
             str=str+"Buzz";
            
        }
        
        if (count%10==0){
            str=str+"Cat";
            
        }
        if (count%2!=0 && count%3!=0 && count%5!=0 && count%10!=0){
        	str=str+count;
        }
        	
    System.out.println(str);
    count=count+1;
    str="";
    }
    
    System.out.println("No more numbers.");

    }




}