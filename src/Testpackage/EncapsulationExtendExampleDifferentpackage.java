package Testpackage;

import com.java.EncapsulationExample;

public class EncapsulationExtendExampleDifferentpackage extends EncapsulationExample
{
	
	public static void main(String args[])
	{
		EncapsulationExample c1=new EncapsulationExample();
	c1.PublicMethod();
	
	//protected method in derived class
	EncapsulationExtendExampleDifferentpackage c2=new EncapsulationExtendExampleDifferentpackage();
	c2.ProtectedMethod();
}

}
