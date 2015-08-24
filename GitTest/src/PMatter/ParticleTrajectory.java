package PMatter;

public class ParticleTrajectory {
	
	public static void simulateTrajectory(Particle [] p, int iterate)
	{
		ParticleDrift[] PD = new ParticleDrift[p.length];
		for(int i=0;i<p.length;i++)
		{
			PD[i] = new ParticleDrift();
		}
		while(iterate >= 0)
		{
			for(int i=0;i<p.length;i++)
				PD[i].ParticleDrift(p[i],p);
			iterate--;
		}
	}
	public void timePrecision(double time)
	{
		ParticleDrift.timePrecision=time;
	}
	
}
