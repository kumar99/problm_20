import java.math.BigDecimal;


class Prob20
{
static double sum=0;

    public static void main(String[] args) 
	{
        BigDecimal a= BigDecimal.ONE;
        for(long i=1;i<101;i++)
		{
        a=a.multiply(BigDecimal.valueOf(i));
        
        	}
      String num=a+"";
        for (int i = 0; i < num.length(); i++) 
		{
            sum=sum+Integer.parseInt(num.charAt(i)+"");
        	}
        System.out.println(sum);
    	}
}

