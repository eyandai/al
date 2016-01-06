package al.sort;

import java.util.List;
import java.math.BigDecimal;

public class QuickSort {

	public List<BigDecimal> data;
	public QuickSort(List<BigDecimal> list){
		this.data=list;
	}
	public void sort(){
		if (isNull()) {
			return;
		}
		
	}
	
	public void quickSort(List<BigDecimal>,int low, int high){
		
	}
	private boolean isNull() {
		if (data==null || data.size()==0) {
			return true;
		}
		return false;
	}
	private void printData() {
		for (BigDecimal element : data) {
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
	}
	
}
