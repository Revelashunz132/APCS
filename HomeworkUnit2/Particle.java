//package unit3;

public class Particle {
    private double velocity;

    public Particle(double v){
        velocity = v;
    }
    public double getVelocity() {
        return velocity;
    }
    
    public void setVelocity (double v) {
        this.velocity = v;
    }

    public void hit (Particle p) {
        double v = p.getVelocity();
        p.setVelocity(getVelocity());
        setVelocity(v);
    }

    public void hit(Particle p, int i){
        double v = p.velocity;
        p.velocity = this.velocity;
        velocity = v;
    }

    public String toString(){
        return (""+ velocity);
    }

    public static void main (String args[]){
        Particle p1= new Particle (4.5);
        Particle p2 = new Particle (6.7);
        p1.hit(p2);
        System.out.println(p1 + " " + p2);
    }
}
