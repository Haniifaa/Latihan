public class Matematika2{
    int hasili;
    double hasild;
    float hasilf;
    void pertambahan(int x,int y){
        hasili=x+y;
        System.out.println("Pertambahan : "+x+"+"+y+"="+hasili);
    }
    void pertambahan(float x,float y){
        hasilf=x+y;
        System.out.println("Pertambahan : "+x+"+"+y+"="+hasilf);
    }
    void pertambahan(double x,double y,double z){
        hasild = x+y+z;
        System.out.println("Pertambahan : "+x+"+"+y+"+"+z+"="+hasild);
    }
    void pengurangan(int x,int y){
        hasili=x-y;
        System.out.println("pengurangan : "+x+"-"+y+"="+hasili);
    }
    void pengurangan(float x,float y){
        hasilf=x-y;
        System.out.println("pengurangan : "+x+"-"+y+"="+hasilf);
    }
    void pengurangan(double x,double y,double z){
        hasild=x-y-z;
        System.out.println("pengurangan : "+x+"-"+y+"-"+z+"="+hasild);
    }
    void perkalian(int x,int y){
        hasili=x*y;
        System.out.println("perkalian : "+x+"x"+y+"="+hasili);
    }
    void perkalian(float x,float y){
        hasilf=x*y;
        System.out.println("perkalian : "+x+"x"+y+"="+hasilf);
    }
    void perkalian(Double x,Double y,double z){
        hasild=x*y*z;
        System.out.println("perkalian : "+x+"x"+y+"x"+z+"="+hasild);
    }
    void pembagian(int x,int y){
        hasili=x/y;
        System.out.println("pembagian : "+x+"/"+y+"="+hasili);
    }
    void pembagian(float x,float y){
        hasilf=x/y;
        System.out.println("pembagian : "+x+"/"+y+"="+hasilf);
    }
    void pembagian(Double x,Double y,double z){
        hasild=x/y/z;
        System.out.println("pembagian : "+x+"/"+y+"/"+z+"="+hasild);
    }
}