package calculette;

public class NullOperation extends Operation {

	@Override
	public int calcul(int operant, int operantPrecendant) 
	{
		return operant;
	}

}
