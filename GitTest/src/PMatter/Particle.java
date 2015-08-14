package PMatter;
public class Particle 
{
	private int mass;
	private String particleID;
	public ParticleCoordinate PC;
	static int counter = 1;
	private static boolean gravity;
	public Particle(int mass, ParticleCoordinate PC)
	{
		this.mass = mass;
		this.PC = PC;
		particleID = "M"+counter;
		counter+=1;
		getParticleData();
	}
	public Particle(boolean gravity)
	{
		this.gravity = gravity;
	}
	public void getParticleData()
	{
		System.out.println(this.particleID+": "+this.mass+" & "+this.PC.printX()+", "+this.PC.printY());
	}
}