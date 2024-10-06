import java.util.ArrayList;

public class TwentySix_dice {
    public static void main(String[] args) {
        System.out.println(diceRet("", 4));
    }

    public static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++) {
            dice(p + i, target-i);
        }
    }

    public static ArrayList diceRet(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++) {
            ans.addAll(diceRet(p + i, target-i));
        } return ans;
    }

    public static void diceFace(String p, int target, int face) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=face && i<=target; i++) {
            diceFace(p + i, target-i, face);
        }
    }

    public static ArrayList diceRetFace(String p, int target, int face) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++) {
            ans.addAll(diceRetFace(p + i, target-i, face));
        } return ans;
    }

}