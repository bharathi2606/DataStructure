package HashCode;
import java.util.*;
public class HashCode {
	public Map<Integer,List<Integer>> dataMap= new HashMap<>();
	public void add(Integer data) {
		Integer hashCode = data%10;
		if(dataMap.containsKey(hashCode)) {
			this.dataMap.get(hashCode).add(data);
		}else {
			List<Integer> l =  new ArrayList<>();
			l.add(data);
			this.dataMap.put(hashCode, l);
		}
	}
	public void search(int SearchData) {
		int hashCode = SearchData%10;
		if(dataMap.containsKey(hashCode)) {
			dataMap.get(hashCode).stream().filter(data->data==SearchData).forEach(data->{
				System.out.println("Found");
			});
		}else {
			System.out.println("Not Found");
		}
	}
	public static void main(String[] args) {
		List<Integer>  l= Arrays.asList(21,23,54,33);
		HashCode hc=new HashCode();
		l.stream().forEach(data->{
			hc.add(data);
		});
		System.out.println(hc.dataMap);
		hc.search(23);
	}
}
