
public class CQdemocomplex 
{
   public static void main(String[] args)
	{
		CQComplex  c1=new CQComplex(12,13);
		CQComplex c2=new CQComplex(1,-3);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		CQComplex a=new CQComplex();
		System.out.println(a.addComplex(c1, c2));
		System.out.println(a.subComplex(c1, c2));
		System.out.println(a.mulComplex(c1, c2));

	}

}
