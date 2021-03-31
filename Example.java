
public class Example {

	public static void main(String[] args) {
		//1st line -- variable creating a reference that is null for now
		int[] array;
		array = new int[12];
		
		for(int t = 0; t < array.length; ++t) {
			array[t] = t * 2 + 1;
		}
		
		System.out.println(array);
		for(int element : array) {
			System.out.println(element + " ");
		}
		System.out.println();
		
		LargeIntegerArray baz = new LargeIntegerArray();
		System.out.println(baz.get(1000));
		baz.set(1000, 42);
		baz.set(2000, 7);
		System.out.println(baz.get(1000));
		System.out.println(baz.get(2000));

	}

}
