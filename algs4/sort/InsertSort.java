package sort;

public class InsertSort extends SortExample{
	public static void Sort(Comparable[] a) {
		for(int i=1;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(less(a[j],a[j-1]))
					exch(a,j,j-1);
			}
		}
	}
}
