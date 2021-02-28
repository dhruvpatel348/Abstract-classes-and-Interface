//Dhruvkumar Patel
//Lab 4 - Program -2

abstract class Robot
{
}
class RobotA extends Robot
{
}
class RobotB extends Robot implements Locomotion
{
	public void forward()
	{
		System.out.println("RobotB goes Forward");
	}
	public void reverse()
	{
		System.out.println("RobotB Reverse");
	}
	public void stop()
	{
		System.out.println("RobotB Stops");
	}


}
class RobotC extends Robot implements Locomotion,Sound
{
	public void forward()
	{
		System.out.println("RobotC goes Forward");
	}
	public void reverse()
	{
		System.out.println("RobotC Reverse");
	}
	public void stop()
	{
		System.out.println("RobotC Stops");
	}
	public void beep()
	{
		System.out.println("RobotC Beeps");
	}
}
class RobotA1 extends RobotA implements Sound
{
	public void beep()
	{
		System.out.println("RobotA1 Beeps");
	}
}
class RobotB1 extends RobotB implements Sound
{
	public void beep()
	{
		System.out.println("RobotB1 Beeps");
	}
}
class RobotB2 extends RobotB
{
}
class RobotC1 extends RobotC
{
}
interface Locomotion
{
	public void forward();
	public void reverse();
	public void stop();
}
interface Sound
{
	public void beep();
}
public class TestRobotProg
{
	public static void main(String[] args)
	{
		Robot[] robot = {new RobotA(),new RobotB(),new RobotC(),new RobotA1(),new RobotB1(),new RobotB2(),new RobotC1()};

     for(int indx = 0; indx<robot.length;indx++)
     {
		if(robot[indx] instanceof Sound)
		{
			Sound sound = (Sound) robot[indx];
			sound.beep();
		}
		if(robot[indx] instanceof Locomotion)
		{
			Locomotion locomotion = (Locomotion) robot[indx];
			locomotion.stop();
		}
	}

	}
}

