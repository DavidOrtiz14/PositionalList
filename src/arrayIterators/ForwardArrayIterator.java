package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	private int current=0;
	// other internal fields...
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		// initialize other internal fields as needed
	}
	
	public boolean hasNext() {
		if(current==arr.length){
			return false;
		}
		return true;   
	}

	public E next() throws NoSuchElementException {
		if (!hasNext()){
			throw new NoSuchElementException("No more elements to iterate over."); 
		}
		int m =current;
		current++;
		return arr[m];
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
