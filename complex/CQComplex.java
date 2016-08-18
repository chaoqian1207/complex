
public class CQComplex
{
	private double real;
	private double vir;
	
  public CQComplex()
	{
		this(0.0, 0.0);
	}
  public CQComplex(double real)
	{
		this(real, 0.0);
	}
	
  public void setComplex(double real)
	{
		setComplex(real, 0.0);
	}
	
  public CQComplex(CQComplex c)
	{
		this(c.real, c.vir);
	}
  public CQComplex(double real, double vir) 
	{
		setComplex(real, vir);
	}
  private void setComplex(double real , double vir) 
	{
		setReal(real);
		setVir(vir);	
	}
  private void setVir(double vir)
  {
		this.vir =vir;	
  }


 private void setReal(double real) 
  {
	
	  this.real = real;
  }

  public double real()
 {
	return real;
 }

  public double vir()
 {
	return vir;
 }
 
  public String toString()
  {
	String res = "";
    res+="("+real+","+vir+")";
	return res;
  }

  public CQComplex addComplex(CQComplex c1,CQComplex c2 )
  {
	return new CQComplex(c1.real + c2.real,	c1.vir + c2.vir);
  }

   public CQComplex subComplex(CQComplex c1,CQComplex c2 )
  {
	return new CQComplex(c1.real - c2.real,
			c1.vir - c2.vir);
  }

   CQComplex mulComplex(CQComplex c1,CQComplex c2)
  {
	return new CQComplex(c1.real*c2.real-c1.vir*c2.vir,c1.vir*c2.real-c1.real*c2.vir);
  }
}
