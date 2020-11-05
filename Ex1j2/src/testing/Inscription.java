package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Inscription {
InscriptionValidation ins;
	
@Ignore
@Before
public void before()
{
ins=new InscriptionValidation();	

}
@Test
public void validerNom()
{
	Assert.assertEquals(false,ins.verifNom("az"));
	

}
@Test
public void lenghtpass()
{
	Assert.assertEquals(false,ins.verifLengthPass("teste"));
	

}
@Test
public void verifexistance()
{
Assert.assertEquals(false, ins.mdpnom("tested", "Martin"));	

}
@Test
public void validateEmail()
{
	
Assert.assertEquals(false, ins.validateMail("testuser.com"));

}
public static void main(String args[])
{
	
	InscriptionValidation insc=new InscriptionValidation();
	String nom="jhon";
	String email="martin@gmail.com";
	String mdp="passwordyoume";
	if(!insc.verifLengthPass(mdp))
	{
		System.out.println("le mot de passe doit avoir au moins 8 caractéres");
		
	}
	else if(insc.mdpnom(mdp, nom))
	{
		System.out.println("le mot de passe ne doit pas contenir votre nom");
	}
	else if(!insc.validateMail(email))
	{
		System.out.println("le email doit contenir le symbole @");

		
		
	}
	else if(!insc.verifNom(nom))
	{
		System.out.println("le nom doit avoir au moins 3 caractéres");

		
		
	}
	else
	{
		System.out.println("inscrit avec succés");

		
		
	}


}
}
