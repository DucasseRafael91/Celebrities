package Celebrities;

import java.util.LinkedHashMap;
import java.util.Map;

public class Celebrities {

    public static void main(String[] args) {
        
        Map<String, int[]> invitees = new LinkedHashMap<>(); 
        invitees.put("Albert", new int[] {2, 5, 6});
        invitees.put("Bénédicte", new int[] {3, 5, 6});
        invitees.put("Christophe", new int[] {2, 4, 5, 6});
        invitees.put("Delphine", new int[] {1, 2, 5, 6, 8});
        invitees.put("Edouard", new int[] {6});
        invitees.put("Françoise", new int[] {5});
        invitees.put("Gaston", new int[] {2, 3, 5, 6, 8});
        invitees.put("Heloïse", new int[] {2, 4, 5, 6, 7});
    
        for (Map.Entry<String, int[]> invite : invitees.entrySet()) {
            System.out.print(invite.getKey() + " ");
            for (int num : invite.getValue()) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }
}
