package ArrayList;

public class ArrayList<T> {
	
	private T data[];
	private int capacity=0;
	private int size = 0;
  
	ArrayList( int size ){
		if( size < 1 )
			this.capacity = 20;
		else
		    this.capacity = size;

		data = ( T[] ) new Object[ this.capacity ];
	}

	ArrayList() {
		this.capacity = 20;
		data = ( T[] ) new Object[ this.capacity ];
	}
	
	public void add( T d ) {
		if( size == capacity - 1 ) {
			this.doubleArray();
		}
		this.data[this.size++] = d;
	}
	
	public void addAt( int index, T d ) {
		
		if( index >= this.size ) {
			return;
		}

		if( size == capacity -1 ) {
			this.doubleArray();
		}

		for( int i = this.size; i >= index; i--) { 
			if( i > index ) {
				this.data[ i ] = this.data[ i - 1 ];
			}else {
				this.data[i] = d;
			}
		}

		this.size++;
	}
	
	public void removeAt( int index ) {

		if( index >= this.size ) {
		  return;	
		}

		this.data[index] = null;
		
		for( int i = index; i < this.size; i++ ) {
			this.data[i] = this.data[i+1];
		}

	    this.data[this.size-1] = null;	
		this.size--;
	}
	
	public void printList() {
		for( int i = 0; i < this.size; i++ ) {
		  System.out.println(this.data[i]);	
		}
	}
	
	public T getAt( int index ) { 
		if( index >= this.size ) {
		  return null;	
		}
		return this.data[index];
	}

	public int getSize() { return size; }
	
	private void doubleArray() {
		this.capacity *= 2;
		T tmp[] =( T[] ) new Object[ this.capacity ];
		
		for( int i = 0; i < this.data.length; i++ ) {
		  tmp[i] = this.data[i];	
		}

		this.data = tmp;
	}
}







