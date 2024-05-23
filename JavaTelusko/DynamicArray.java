public class DynamicArray {
    // dont ise private to simplify testing
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        // size = 0;
        // capacity = 1;
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        // size = 0;
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object o) {
        if (size == capacity) {
            grow();
        }
        array[size] = o;
        size++;
    
    }
    public void insert(int index, Object o) {   
        if(size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = o;
        size++;
    
    }
    public void delete(Object o)  {
        for (int i = 0; i < size; i++) {    
            if (array[i] == o) {
                // for (int j = i; j < size; j++) {
                //     array[j] = array[j+1];
                // }
                // size--;
                for (int j=0; j<(size-i-1); j++) {
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if (size<=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }   
    public int search(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }
    private void grow() {
        // grow array
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {    // can use size or capacity
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }   
    private void shrink() { 
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {    // cannot use capacity. Error:Index 5 out of bounds for length 5
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        String string="";
        for(int i=0;i<capacity;i++){ // can use size or capacity
            string+=array[i]+", ";
        }
        if (string !="") {
            string = "["+string.substring(0, string.length() - 2)+"]"; // remove ", "
        } else {
            string = "[]";
        }

        return string;
    }
}
