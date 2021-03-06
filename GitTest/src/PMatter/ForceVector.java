package PMatter;

import java.lang.Math;


public class ForceVector
{
	private double ForceX=0;
	private double ForceY=0;
	private final double G = 6.673*Math.pow(10.0,-11.0);
	public void  calculateForce(Particle particle,Particle [] args)
	{
		double[] angle = new double[args.length-1];
		for(int i=0;i<args.length-1;i++)
		{
			if(particle.getID()!=args[i].getID() && particle.PC.printX()-args[i].PC.printX() != 0)
			{
			angle[i] = (particle.PC.printY()-args[i].PC.printY())/
			(particle.PC.printX()-args[i].PC.printX());
			}
		}
		for(int i=0;i<args.length-1;i++)
		{
			if(particle.getID()!=args[i].getID())
			{
				if(particle.PC.printY()==args[i].PC.printY())
				{
					ForceY = ForceY + (this.G*particle.getMass()*args[i].getMass()/
							Math.pow((particle.PC.printY()-args[i].PC.printY()),2)+
							Math.pow((particle.PC.printX()-args[i].PC.printX()),2)
							);
				}
				else
				{
					ForceY = ForceY + (this.G*particle.getMass()*args[i].getMass()/
							Math.pow((particle.PC.printY()-args[i].PC.printY()),2)+
							Math.pow((particle.PC.printX()-args[i].PC.printX()),2)
							)*angle[i];
				}
				if(particle.PC.printX()==args[i].PC.printX())
				{
					ForceY = ForceY + (this.G*particle.getMass()*args[i].getMass()/
							Math.pow((particle.PC.printY()-args[i].PC.printY()),2)+
							Math.pow((particle.PC.printX()-args[i].PC.printX()),2)
							);
				}
				else
				{
					ForceX = ForceX + (this.G*particle.getMass()*args[i].getMass()/
							Math.pow((particle.PC.printY()-args[i].PC.printY()),2)+
							Math.pow((particle.PC.printX()-args[i].PC.printX()),2)
							)*(1/angle[i]);
				}
			}
		}
	}
	public double getForce() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(this.ForceX,2)+Math.pow(this.ForceY,2));
	}
	public double getAngle()
	{
		return this.ForceY/this.ForceX;
	}
}