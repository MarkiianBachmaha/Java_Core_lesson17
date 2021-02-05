package task01;

public interface Iterator {
	boolean hasNext();

	Integer next();
}

class Collection {
	private static Integer[] array;

	Collection(Integer[] array) {
		Collection.array = array;
	}

	public class ForwardIterator implements Iterator {

		private int a = 0;

		@Override
		public boolean hasNext() {
			return a < array.length;
		}

		@Override
		public Integer next() {
			return array[a++];
		}

	}

	public ForwardIterator createForwardIterator() {
		return new ForwardIterator();
	}

	public class BackwardIterator implements Iterator {

		private int count = array.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Integer next() {
			count = count - 2;
			return array[count + 2];
		}
	}

	public BackwardIterator createBackwardIterator() {
		return new BackwardIterator();
	}

}
