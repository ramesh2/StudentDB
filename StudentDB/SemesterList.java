import java.io.*;
import java.util.*;

public class SemesterList extends Hashtable implements Serializable
{
  /**
   *Sorts the Semester List according to Semester Code in ascending order
   *@return Vector containing sorted elements.
   */
  public Vector sort(){
    Set sKeys = this.keySet();
    Vector temp = new Vector(sKeys);
    Collections.sort(temp);
    
    Vector sorted = new Vector();
    
    for(int a=0;a<temp.size();a++){
      sorted.add(this.get(temp.elementAt(a)));
    }
    
    return sorted;
  }
}//class