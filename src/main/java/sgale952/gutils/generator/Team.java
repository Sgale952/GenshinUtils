package sgale952.gutils.generator;

import java.util.ArrayList;

public class Team {

    public static ArrayList<String> characterCheckList = new ArrayList<>(70);

    static int getRandomCharacter() {
        return (int) (Math.random() * characterCheckList.size());
    }

    public static int[] randTeam(){
        int c1 = getRandomCharacter();
        int c2 = getRandomCharacter();
        int c3 = getRandomCharacter();
        int c4 = getRandomCharacter();

        while (c1==c2 || c1==c3 || c1==c4 || c2==c3 || c2==c4 || c3==c4){
            c1 = getRandomCharacter();
            c2 = getRandomCharacter();
            c3 = getRandomCharacter();
            c4 = getRandomCharacter();
        }
        return new int[]{c1, c2, c3, c4};
    }

    public static String getCharacterFrame(int i){
        return characterCheckList.get(i);
    }

}