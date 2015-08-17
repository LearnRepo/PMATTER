package PMatter;
import java.util.Random;
public class Creator
{
	public static void main(String [] args)
	{
		int numOfParticle = 2;
		int counter;
		Particle[] p = new Particle[numOfParticle];
		
		Atmosphere atm = new Atmosphere();
		atm.Atmosphere("First Atmosphere");
		
		p[0] = new Particle(true);
		
		ParticleCoordinate PC = new ParticleCoordinate();
		PC.ParticleCoordinate(0,0);
		p[0] = new Particle(1,PC);
		
		PC = new ParticleCoordinate();
		PC.ParticleCoordinate(1, 1);
		p[1] = new Particle(1,PC);
		
		// Random particle creator
		/*Random rndGenerator = new Random();
		for(counter=0;counter<numOfParticle;counter++)
		{
			//System.out.print();
			ParticleCoordinate PC = new ParticleCoordinate();
			PC.ParticleCoordinate(rndGenerator.nextDouble()*100,rndGenerator.nextDouble()*100);
			p[counter] = new Particle(rndGenerator.nextDouble()*100,PC);
		}*/
		for(counter=0;counter<numOfParticle;counter++)
		{
			p[counter].getParticleData();
		}
		
		ForceVector FV = new ForceVector();
		FV.calculateForce(p[1], p);
		System.out.println(FV.getForce()+" "+FV.getAngle());
		
	}
}