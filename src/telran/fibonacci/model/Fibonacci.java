package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
	private int quantity;

	public Fibonacci(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int ind = 0;
			private int cur = 0;
			private int next = 1;
			@Override
			public boolean hasNext() {
				return ind < quantity;
			}

			@Override
			public Integer next() {
				if(ind == 0){
					ind++;
					return 1;
				}
				int res = cur + next;
				cur = next;
				next = res;
				ind++;
				return res;
			}
		};
	}
}
