package calculette;

public class Division extends Operation
{

	public int calcul(int operant, int operantPrecedent)
	{
		return (operantPrecedent/operant);
	}

}
