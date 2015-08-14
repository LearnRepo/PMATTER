package PMatter;
public class Atmosphere
{
	static private String AtmName;
	private Particle p1;
	public void Atmosphere(String AtmName)
	{
		this.AtmName = AtmName;
		
	}
	public int effectiveForce(Particle[] particle)
	{
		Particle[] arr = {particle[0],particle[1],particle[2]};
		return ForceVector.resultForce(arr);
	}
}