package PMatter;
import java.util.Random;
public class Creator
{
	public static void main(String [] args)
	{
		int numOfParticle = 10;
		int counter;
		Particle[] p = new Particle[numOfParticle];
		
		Atmosphere atm = new Atmosphere();
		atm.Atmosphere("First Atmosphere");
		
		p[0] = new Particle(true);
		Random rndGenerator = new Random();
		for(counter=0;counter<numOfParticle;counter++)
		{
			//System.out.print();
			ParticleCoordinate PC = new ParticleCoordinate();
			PC.ParticleCoordinate(rndGenerator.nextInt(400),rndGenerator.nextInt(600));
			p[counter] = new Particle(rndGenerator.nextInt(100),PC);
		}
		for(counter=0;counter<numOfParticle;counter++)
		{
			p[counter].getParticleData();
		}
		System.out.println(atm.effectiveForce(p));
	}
}