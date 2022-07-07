
public class Solution {
    public int romanToInt(String s) {
     int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if( i!=s.length()-1)
            {
            if((sumof(s.charAt(i))<sumof(s.charAt(i+1))))
               {
                   sum+=sumof(s.charAt(i+1))-sumof(s.charAt(i));
                                                   i++;
               }
                                                   else
                                                   {
                                                       sum+=sumof(s.charAt(i));
                                                   }
                }
                else
                {
                    sum+=sumof(s.charAt(i));
                }
        }
        return sum;
    }
    public int sumof(char ch){
        int a=0;
        switch(ch){
                
            case 'I' :
                    a=1;
                    break;
                
            case 'V' :
                a=5;
                break; 
                
            case 'X' :
                a=10;
                break;
                
            case 'L' :
                a=50;
                break;
                
            case 'C' :
                a=100;
                break;
                
            case 'D' :
                a=500;
                break;
                
            case 'M' :
                a=1000;
                break;
            
        }
        return a;
    }
}
