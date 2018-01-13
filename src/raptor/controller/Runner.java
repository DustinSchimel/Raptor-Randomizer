package raptor.controller;

/**
 * Runs the project by calling the Controller
 * @author Dustin Schimel
 *
 */
public class Runner
{
	public static void main (String [] args)
	{
		Controller app = new Controller();
		app.start();
	}
}
