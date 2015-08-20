package PMatter;

public class ParticleTrajectory {
	private double timePrecision = 1;
	
	public void simulateTrajectory(Particle [] p)
	{
		ForceVector[] FV = new ForceVector[p.length];
		double initialVelocityX=0;
		double initialVelocityY=0;
		
		for(int i=0;i<p.length;i++)
		{
			FV[i] = new ForceVector();
			FV[i].calculateForce(p[i], p);
		}
		for(int i=0;i<p.length;i++)
		{
			if(FV[i].getForceX()!=0)
			{
				
			}
			if(FV[i].getForceY()!=0)
			{
				
			}
		}
		
	}
	public void timePrecision(double time)
	{
		this.timePrecision=time;
	}
	
}
