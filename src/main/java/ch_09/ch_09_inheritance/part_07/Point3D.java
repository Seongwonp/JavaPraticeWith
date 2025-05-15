package ch_09.ch_09_inheritance.part_07;

public class Point3D extends Point{
    public int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String getLocation() {
        return super.getLocation() + ", z: " + z;
    }

    //    public String getLocation(){
//        return "x: " + x+", y: "+y + ", z: "+z;
//    }
}
