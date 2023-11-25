public class Suhu {
    float hasil;
    void CtoK(float c){
        hasil = 273.15f+c;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoF(float c){
        hasil = 1.8f*c+32;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoRankine(float c){
        hasil = 1.8f*c+491.67f;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoD(float c){
        hasil = 1.5f*(100-c);
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoN(float c){
        hasil = c*33/100;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoReamur(float c){
        hasil = c*0.8f;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
    void CtoRomer(float c){
        hasil = c*21/40+7.5f;
        System.out.println("Hasil koversi suhu "+c+" adalah "+hasil);
    }    
}
