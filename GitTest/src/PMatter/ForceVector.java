package PMatter;

import java.lang.Math;


public class ForceVector
{
	private double ForceX=0;
	private double ForceY=0;
	private final double G = 1;
	
	public void  calculateForce(Particle particle,Particle [] args)
	{
		int k=0;
		Particle[] args2 = new Particle[args.length-1];
		for(int i=0;i<args.length;i++)
		{
			if(particle.getID()!=args[i].getID())
			{
				args2[k++] = args[i];
			}
		}
		
		// angle preparation
		double[] angleX = new double[args2.length];
		double[] angleY = new double[args2.length];
		for(int i=0;i<args2.length;i++)
		{
			angleY[i] = Math.asin((args2[i].PC.printY()-particle.PC.printY())/
					(
						Math.sqrt(
									Math.pow((particle.PC.printY()-args2[i].PC.printY()),2)+
									Math.pow((particle.PC.printX()-args2[i].PC.printX()),2)
								)
					)
					);
			angleX[i] = Math.acos((args2[i].PC.printX()-particle.PC.printX())/
					(
						Math.sqrt(
									Math.pow((particle.PC.printY()-args2[i].PC.printY()),2)+
									Math.pow((particle.PC.printX()-args2[i].PC.printX()),2)
								)
					)
					);
			/*System.out.print(args2[i].getID()+"$ " +Math.toDegrees(angle[i])+", ");
			if(Math.toDegrees(angle[i])<0.0)
			{
				angle[i] = Math.abs(Math.toDegrees(angle[i]))+180;
				angle[i] = Math.toRadians(angle[i]);
			}*/
			System.out.print(args2[i].getID()+"$ " +Math.toDegrees(angleX[i])+Math.toDegrees(angleY[i])+", ");
		}
		for(int i=0;i<args2.length;i++)
		{
			/*System.out.print(Math.sqrt(Math.pow((particle.PC.printY()-args2[i].PC.printY()),2)+
			Math.pow((particle.PC.printX()-args2[i].PC.printX()),2))+" :");*/
			//if(Math.toDegrees(angle[i])!= 0.0 || Math.toDegrees(angle[i])!= -0.0)
					ForceY = ForceY +
							(
									this.G*particle.getMass()*args2[i].getMass()/
									(
											Math.pow((particle.PC.printY()-args2[i].PC.printY()),2)+
											Math.pow((particle.PC.printX()-args2[i].PC.printX()),2)
									)
							)*Math.sin(angleY[i]);
			//if(Math.toDegrees(angle[i])!=90.0 || Math.toDegrees(angle[i])!=-90.0)
					ForceX = ForceX +
							(
									this.G*particle.getMass()*args2[i].getMass()/
									(
											Math.pow((particle.PC.printY()-args2[i].PC.printY()),2)+
											Math.pow((particle.PC.printX()-args2[i].PC.printX()),2)
									)
							)*Math.cos(angleX[i]);
					//System.out.print(ForceY+", "+ForceX+"|");
		}
	}
	public double getForceX() {
		// TODO Auto-generated method stub
		return this.ForceX;
	}
	public double getForceY() {
		// TODO Auto-generated method stub
		return this.ForceY;
	}
	public double getForce()
	{
		return Math.sqrt(Math.pow(this.ForceX,2)+Math.pow(this.ForceY,2));
	}
	public double getUnitX()
	{
		return this.ForceX/Math.sqrt(Math.pow(this.ForceX,2)+Math.pow(this.ForceY,2));
	}
	public double getUnitY()
	{
		return this.ForceY/Math.sqrt(Math.pow(this.ForceX,2)+Math.pow(this.ForceY,2));
	}
	public double getAngle()
	{
		return Math.toDegrees(Math.atan(this.ForceY/this.ForceX));
	}
}