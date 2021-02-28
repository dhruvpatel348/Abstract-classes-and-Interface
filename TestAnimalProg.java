//Dhruvkumar Patel
//Lab 4 - Program -1

abstract class Animal
{
	abstract void print();
}
abstract class Bird extends Animal
{
}
abstract class Reptile extends Animal implements ColdBlooded
{
}
 class Dove extends Bird
{
	void print()
	{
		System.out.print("Dove");
	}
}
 class Hawk extends Bird
{
	void print()
	{
		System.out.print("Hawk");
	}
}
 class Eagle extends Bird
{
	void print()
	{
		System.out.print("Eagle");
	}
}
 class Penguin extends Bird implements OceanDwelling
{
	void print()
	{
		System.out.print("Penguin");
	}
}
 class Seagull extends Bird implements OceanDwelling
{
	void print()
	{
		System.out.print("Seagull");
	}
}
 class RattleSnake extends Reptile
{
	void print()
	{
		System.out.print("RattleSnake");
	}
}
 class Turtle extends Reptile implements OceanDwelling
{
	void print()
	{
		System.out.print("Turtle");
	}
}
interface ColdBlooded
{
}
interface OceanDwelling
{
}

public class TestAnimalProg
{
	public static void main(String[] args)
	{
		Animal[] animal = {new Dove(),new Hawk(),new Eagle(),new Penguin(),new Seagull(),new RattleSnake(),new Turtle()};

		for(int indx = 0; indx<animal.length; indx++)
		{
		if(animal[indx] instanceof ColdBlooded)
		{
			animal[indx].print();
			System.out.println(" is a Cold Blooded Animal");
		}
		if(animal[indx] instanceof OceanDwelling)
		{
			animal[indx].print();
			System.out.println(" is a Ocean Dwelling Animal");
		}
        }
	}
}

