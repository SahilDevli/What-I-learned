import java.util.LinkedHashSet;
import java.util.Iterator;

public class Treeset {
    public static void main(String[] args) {
        // constructor for treeHashSet...
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // methods used in LikedHashSet.....

        for(int i = 0 ; i < 8 ; i++){
            lhs.add(10-i);
        }

        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

    }
}