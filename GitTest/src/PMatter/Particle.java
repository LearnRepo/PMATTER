package PMatter;
public class Particle 
{
	private double mass;
	private String particleID;
	public ParticleCoordinate PC;
	static int counter = 1;
	private static boolean gravity;
	public Particle(double mass, ParticleCoordinate PC)
	{
		this.mass = mass;
		this.PC = PC;
		particleID = "M"+counter;
		counter+=1;
	}
	public Particle(boolean gravity)
	{
		this.gravity = gravity;
	}
	public void getParticleData()
	{
		System.out.println(this.particleID+": "+this.mass+" & "+this.PC.printX()+", "+this.PC.printY());
	}
	public String getID() {
		// TODO Auto-generated method stub
		return this.particleID;
	}
	public double getMass()
	{
		return (this.mass);
	}
}