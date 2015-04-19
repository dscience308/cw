/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arena;

import lifeforms.CharManager;
import lifeforms.Human;

/**
 *
 * @author Travis
 */
public class Arena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 100;
        CharManager charManager = CharManager.getInstance();
        for (int x = 0;x < count;x++)
        {
            Human h = new Human();
            h.init();           
            charManager.addCharacters(h);
            //System.out.println(h.getInfo());
        }
        new StartPage().setVisible(true);
    }
}
