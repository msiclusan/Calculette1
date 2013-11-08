package calculette;

import java.util.HashMap;

public abstract class Operation 
{
	abstract public int calcul(int operant, int operantPrecendant);
	
	public static Operation selectOperation(Character operateur)
	{
		HashMap<Character, Operation> operations = new HashMap <Character, Operation>();
		operations.put('+', new Addition());
		operations.put('-', new Soustraction());
		operations.put('*', new Multiplication());
		operations.put('/', new Division());
		operations.put('=', new NullOperation());
		return operations.get(operateur);
	}
}
