//Dhruvkumar Patel
//Lab 4 - Program -3

abstract class Animal
{
	private final String name;

	public Animal()
	{
		name = "animal";
	}
	public Animal(String n)
	{
		name = n;
	}

	public void speak()
	{
		System.out.println("This " + name + " speaks");
	}
	public void move()
	{
		System.out.println("This " + name + " moves forward");
	}
}
class Goose extends Animal implements Flying
{
	public Goose()
	{
		super("goose");
	}
	public void fly()
	{
		System.out.println("This " + getClass().getName() + " soars and wings flapping");
	}
}
interface Flying
{
	public void fly();
}
class Lynx extends Animal
{
	public Lynx()
	{
		super("lynx");
	}

}
class Airplane implements Flying
{
	public Airplane(){}
	public void fly()
	{
		System.out.println("This " + getClass().getName() + " soars and engines running");
	}
}
public class ClientClass
{
	public static void main(String[]args)
	{
		Animal animalGoose = new Goose();
		animalGoose.speak();
		animalGoose.move();

		Animal animalLynx = new Lynx();
		animalLynx.speak();
		animalLynx.move();

		Flying flyAirplane = new Airplane();
		flyAirplane.fly();

		Flying flyGoose = new Goose();
		flyGoose.fly();
	}
}

