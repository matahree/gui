import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class Collection<TItem>  {
    
	ArrayList<TItem> list = new ArrayList<TItem>();

	class InnerClass implements ListIterator<TItem> {
		ArrayList<TItem> list = null;
		int index = 0;
		int previousReturnedIndex = -1;
		boolean canRemoveSet = false;
		
		public InnerClass(ArrayList<TItem> input){
			this.list = input;	
		}
		
		public boolean hasNext() {
			return index < list.size();
		}
		
		public TItem next() {
			if (!hasNext()) {
				throw new NoSuchElementException("The Collection contains no next element");
			}
			TItem next = list.get(index);
			previousReturnedIndex = index;
			index += 1;
			canRemoveSet = true;
			return next;
		}

		@Override
		public boolean hasPrevious() {
			return index > 0;
		}

		@Override
		public TItem previous() {
			if (!hasPrevious()) {
				throw new NoSuchElementException("The Collection contains no previous element");
			}
			index -= 1;
			TItem previous = list.get(index);
			previousReturnedIndex = index;
			canRemoveSet = true;
			return previous;
		}

		@Override
		public int nextIndex() {
			return index;
		}

		@Override
		public int previousIndex() {
			return index - 1;
		}

		@Override
		public void set(TItem item) {
			if (!canRemoveSet) {
				throw new IllegalStateException("A call to set must not follow add or remove and previous or next must have been called at least once");
			}
			list.set(previousReturnedIndex, item);
		}

		@Override
		public void add(TItem item) {
			list.add(index, item);
			index += 1;
			canRemoveSet = false;
		}

		@Override
		public void remove() {
			if (!canRemoveSet) {
				throw new IllegalStateException("A call to remove must follow previous or next");
			}
			list.remove(previousReturnedIndex);
			canRemoveSet = false;
		}
	}
	
	public ListIterator<TItem> listIterator() {
		return new InnerClass(list);
	}

	//Changed the return signature of this method. The assignment asks for returning Iterator<TItem>, not the subclass.
	public Iterator<TItem> iterator(){
		return new InnerClass(list);
	}

	public void add(TItem element){
		list.add(element);
	}
}