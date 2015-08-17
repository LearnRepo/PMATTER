package PMatter;

public class ParticleCoordinate {
	private double x;
	private double y;
	public void ParticleCoordinate(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double printX()
	{
		return this.x;
	}
	public double printY()
	{
		return this.y;
	}
}