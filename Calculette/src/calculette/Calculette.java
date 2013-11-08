package calculette;

public class Calculette 
{
	private int resultat;
	private int operant;
	private int operantPrecedent;
	private Operation operation= new Addition();
	
	public int resultat() 
	{
		return this.resultat;
	}

	public Calculette click(char c) 
	{
		this.transfereOperant();
		operation = Operation.selectOperation(c);
		return this;
	}
	
	public Calculette click(int i)
	{
		this.operant=this.operant*10+i;	
		return this;
	}

	public void transfereOperant()
	{
		this.operantPrecedent=operation.calcul(this.operant, this.operantPrecedent);
		this.operant=0;
		this.resultat=this.operantPrecedent;
	}
}
