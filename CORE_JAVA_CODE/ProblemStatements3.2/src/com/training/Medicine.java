package com.training;

public class Medicine
{
public void displayLabel1()
{
System.out.println("Company : Flex Pharma");
System.out.println("Address : Pune");
}

public void displayLabel() {
	// TODO Auto-generated method stub
	
}
}
class Tablet extends Medicine
{
public void displayLabel1()
{
System.out.println("store in a cool dry place");
}
}
class Syrup extends Medicine
{
public void displayLabel1()
{
System.out.println("Consumption as directed by the physician");
}
}
class Ointment extends Medicine
{
public void displayLabel1()
{
System.out.println("for external use only");
}
}