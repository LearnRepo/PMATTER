package PMatter;
public class ForceVector
{
	private double rForceX;
	private double rForceY;
	private double rForceZ;
	
	public void resultForce(Particle p1, Particle [] args)
	{
		//calculate angel
		double[] angle = new double[args.length-1];
		double[] distance = new double[args.length-1];
		for(int i=0;i<args.length-1;i++)
		{
			if(p1.getParticleID()!=args[i].getParticleID())
			{
				angle[i] =(double)(p1.PC.printX()-args[i].PC.printX())/(double)(p1.PC.printX()-args[i].PC.printX());
			}
			else i--;
		}
		for(int i=0;i<args.length-1;i++)
		{
			if(p1.getParticleID()!=args[i].getParticleID())
			{
				
			}
		}
	}
}