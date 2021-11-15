import java.util.ArrayList;


public class HS {

    public static String getOut(int numberOfMatches, String squads, int squad1, int squad2)
    {
        ArrayList<java.util.HashSet<String>> lst = new ArrayList<java.util.HashSet<String>>();
        String[] allTeams = squads.split("#");
        for(int i=0;i<allTeams.length;i++) {
            String[] allPlayers = allTeams[i].trim().split(" ");
            java.util.HashSet<String> players = new java.util.HashSet<>();
            for(String s : allPlayers) {
                players.add(s);
            }
            lst.add(players);
        }
        java.util.HashSet<String> res = new java.util.HashSet<String>(lst.get(0));
        for(java.util.HashSet<String> set : lst) {
            res.retainAll(set);
        }
        String ans1="";
        for(String s : res) {
            ans1=ans1+s+" ";
        }
        System.out.print(ans1.trim()+", ");
        String ans2 = "";
        for(String s : lst.get(squad2-1)) {
            if(!lst.get(squad1-1).contains(s))
                ans2=ans2+s+" ";
        }
        System.out.print(ans2.trim());
        System.out.println();
        String unk = (ans1.trim())+ans2.trim();
        System.out.println(unk.hashCode());

        return null;
    }

}
