package lifeforms;


import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class CharManager {
    private static CharManager instance = null;
    Map characters = new HashMap();
    private CharManager(){}
    
    public static CharManager getInstance()
    {
        if(instance == null) {
         instance = new CharManager();
      }
      return instance;

    }
    
    public void addCharacters(Human x)
    {
        characters.put(x.id,x);
    }
    
}
