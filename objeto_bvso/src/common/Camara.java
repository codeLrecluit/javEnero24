package common;

public class Camara {
	double mpx;
	double sensor;
	double distFocal;
	
	public Camara() {
		
	}

	public Camara(double mpx, double sensor, double distFocal) {
		super();
		this.mpx = mpx;
		this.sensor = sensor;
		this.distFocal = distFocal;
	}

	public double getMpx() {
		return mpx;
	}

	public void setMpx(double mpx) {
		this.mpx = mpx;
	}

	public double getSensor() {
		return sensor;
	}

	public void setSensor(double sensor) {
		this.sensor = sensor;
	}

	public double getDistFocal() {
		return distFocal;
	}

	public void setDistFocal(double distFocal) {
		this.distFocal = distFocal;
	}

	@Override
	public String toString() {
		return "Camara [mpx=" + mpx + ", sensor=" + sensor + ", distFocal=" + distFocal + "]";
	}
	
}
