package testing;

import static org.hamcrest.CoreMatchers.containsString;

public class InscriptionValidation {
	public boolean verifNom(String nom)
	{
		return nom.length()>=3;
		
		
	}
	public boolean verifLengthPass(String password)
	{
		return password.length()>=8;
		
		
		
	}
public boolean mdpnom(String mdp,String nom)
{
	
return mdp.contains(nom);
}
public boolean validateMail(String email)
{
return email.contains("@");	

}
}
