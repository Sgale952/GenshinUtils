package sgale952.gutils.generator;

class MainStats {

    static String[] sand = {"HP%", "ATK%", "DEF%", "Energy Recharge%", "Elemental Mastery"};
    static String[] goblet = {"Pyro DMG Bonus%", "Electro DMG Bonus%", "Cryo DMG Bonus%",
            "Hydro DMG Bonus%", "Dendro DMG Bonus%", "Anemo DMG Bonus%","Geo DMG Bonus%",
            "Physical DMG Bonus%", "HP%", "ATK%", "DEF%", "Elemental Mastery"};
    static String[] circlet = {"HP%", "ATK%", "DEF%", "CRIT Rate%", "CRIT DMG%", "Healing Bonus%", "Elemental Mastery"};

    static String MainStatSand(){
        double r = (Math.random()*100);
        if (r<=26.68) {
            return sand[0];
        }
        else if (r>26.68 && r<=53.34) {
            return sand[1];
        }
        else if (r>53.34 && r<=80) {
            return sand[2];
        }
        else if (r>80 && r<=90) {
            return sand[3];
        }
        else return sand[4];
    }
    static String MainStatGoblet(){
        double r = (Math.random()*100);
        if (r<=19.25) {
            return goblet[8];
        }
        else if (r>19.25 && r<=38.5) {
            return goblet[9];
        }
        else if (r>38.5 && r<=57.5) {
            return goblet[10];
        }
        else if (r>57.5 && r<=97.5) {
            return goblet[(int)(Math.random()*8)];
        }
        else return goblet[11];
    }
    static String MainStatCirclet(){
        double r = (Math.random()*100);
        if (r<=66.00) {
            return circlet[(int)(Math.random()*3)];
        }
        else if (r>66.00 && r<=96.00) {
            return circlet[(int)(Math.random()*3+3)];
        }
        else return circlet[6];
    }
}

class SubStats {
    static Object[][][] subStats =
            {{{"flatHP"},{209.13, 239.00, 268.88, 298.75}}, /*flatHP*/
            {{"flatATK"},{13.62, 15.56, 17.51, 19.45}},     /*flatATK*/
            {{"flatDEF"},{16.20, 18.52, 20.83, 23.15}},     /*flatDEF*/
            {{"percentHP_ATK"},{4.08, 4.66, 5.25, 5.83}},   /*percentHP_ATK*/
            {{"percentDEF"},{5.10, 5.83, 6.56, 7.29}},      /*percentDEF*/
            {{"EM"},{16.32, 18.65, 20.98, 23.31}},          /*EM*/
            {{"ER"},{4.53, 5.18, 5.83, 6.48}},              /*ER*/
            {{"CR"},{2.72, 3.11, 3.50, 3.89}},              /*CR*/
            {{"CD"},{5.44, 6.22, 6.99, 7.77}}};             /*CD*/

    static int getNumberSubStats(){
        double r = Math.random();
        if (r<=0.70){
        return 3;
        }
        else{
        return 4;
        }
    }
    static String getFlowerSubStats(int numSubStats){
        if(numSubStats == 3){
            Object s1 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            Object s2 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            Object s3 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];

            while (s1==s2 || s1==s3 || s2==s3){
                s1 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
                s2 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
                s3 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            }
            return s1+"\n"+s2+"\n"+s3;
        }
        else{
            Object s1 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            Object s2 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            Object s3 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            Object s4 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];

            while (s1==s2 || s1==s3 || s2==s3){
                s1 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
                s2 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
                s3 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
                s4 = subStats[(int)(Math.random()*8+1)][1][(int)(Math.random()*5)];
            }
            return s1+"\n"+s2+"\n"+s3+"\n"+s4;
        }
    }
}

public class Artifact {
    static String[] artifact = {"Flower of Life", "Plume of Death", "Sands of Eon", "Goblet of Eonothem", "Circlet of Logos"};
    static int getType() {
        return (int) (Math.random()*5);
    }
    static String getMainStat(int type){
        if(type == 0) {
            return artifact[0]+"\nHP"+"\n"+SubStats.getFlowerSubStats(SubStats.getNumberSubStats());
        }
        else if (type == 1) {
            return artifact[1]+"\nATK";
        }
        else if (type == 2) {
            return artifact[2]+"\n"+MainStats.MainStatSand();
        }
        else if (type == 3) {
            return artifact[3]+"\n"+MainStats.MainStatGoblet();
        }
        else return artifact[4]+"\n"+MainStats.MainStatCirclet();
    }

    /*public static void main(String[] args) {
        System.out.println(getMainStat(0));
    }*/
}