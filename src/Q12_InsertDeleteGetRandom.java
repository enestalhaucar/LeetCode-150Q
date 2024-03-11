import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Q12_InsertDeleteGetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

}

class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if( map.containsKey(val)) return false;
        map.put(val,list.size());
        list.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        int lastElement = list.get(list.size()-1);
        list.set(index,lastElement);
        map.put(lastElement,index);
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}


