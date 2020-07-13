import java.util.Arrays;

public class findMax {
    int[] dlist = {2,6,8,3,7}; 
	int result = 0;
	for (int i = 0; i < dlist.length-1; i++) {
		if (dlist[i] < dlist[i+1]) {
			Arrays.sort(dlist);
		    result = dlist[i+1];
		}
	} System.out.println(result);
    
}