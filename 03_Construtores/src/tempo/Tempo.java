package tempo;

import java.time.LocalTime;
import java.util.Locale;

public class Tempo {
    
    private int hora, min, seg;
    
    public Tempo(int h, int m, int s){
        setHora(h);
        setMin(m);
        setSeg(s);
    }
    
    public void setHora(int h){
        this.hora = h >= 0 && h <= 23 ? h : 0;
    }
    
    public int getHora(){
        return hora;
    }
    
    public void setMin(int m){
        this.min = m >= 0 && m <= 59 ? m : 0;
    }
    
    public int getMin(){
        return min;
    }
    
    public void setSeg(int s){
        this.seg = s >= 0 && s <= 59 ? s : 0;
    }
    
    public int getSeg(){
        return seg;
    }
    
    public void incrementarHora(){
        hora = (hora + 1) % 24; // quando chegar no 24 irá pra 0
    }
    
    public void decrementarHora(){
        hora--;
        
        if(hora < 0 ){
            hora = 23;
        }
    }
    
    public void incrementarMin(){
        min = (min + 1) % 60;
        if(min == 0){
            incrementarHora();
        }
    }
    
    public void decrementarMin(){
        min--;
        if(min < 0){
            min = 0;
            decrementarHora();
        }
    }
    
    public void incrementarSeg(){
        seg = (seg + 1) % 60;
        if(seg == 0){
            incrementarMin();
        }
    }
    
    public void decrementarSeg(){
        seg--;
        if(seg < 0){
            seg = 0;
            decrementarMin();
        }
    }
    
    public String formatarHora1(){
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }
    
    public String formatarHora2(){
        String ampm = (hora < 12) ? "AM" : "PM"; 
        return String.format("%02d:%02d:%02d %s", hora, min, seg, ampm);
    }
}
