package PMatter;

public class ParticleDrift {
	private double initialVelocityX=0;
	private double initialVelocityY=0;
	static double timePrecision = 1;
	private ForceVector FV;
	public ParticleDrift()
	{
		this.FV = new ForceVector();
	}
	public void ParticleDrift(Particle particle, Particle[] p) {
		FV.calculateForce(particle, p); //calculate Force
		particle.PC.ParticleCoordinate(
				particle.PC.printX() +	// get Coordinate X
				(this.initialVelocityX*this.timePrecision) + // calculate distance when velocity in given time
				(0.5*(FV.getForceX()/particle.getMass())*Math.pow(this.timePrecision,2)) //distance by Acceleration
				, 
				particle.PC.printY() +	// Coordinate
				(this.initialVelocityY*this.timePrecision) + // velocity
				(0.5*(FV.getForceY()/particle.getMass())*Math.pow(this.timePrecision,2)) //Acceleration
				);//update coordinate
		this.initialVelocityX = this.initialVelocityX + (FV.getForceX()/particle.getMass()*this.timePrecision);
		this.initialVelocityY = this.initialVelocityY + (FV.getForceY()/particle.getMass()*this.timePrecision);
	}
	
}
