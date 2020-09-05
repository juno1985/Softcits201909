package catchup_6;

public class MyArrayList<E> {

	//默认容量
	private static final int DEFAULT_CAPACITY = 10;
	//存储元素的数组
	Object[] elementData;
	//记录当前list中元素的个数
	private int size;
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	
	public MyArrayList() {
		 this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		 this.size = 0;
	}
	
	public boolean add(E e) {
        add(e, elementData, size);
        return true;
    }

	private void add(E e, Object[] elementData, int size) {
		if(size == this.elementData.length)
			this.elementData = grow(size + 1);
		//在数组末尾添加新的元素
		this.elementData[size] = e;
		this.size++;
		
	}

	private Object[] grow(int minCapacity) {
		//扩容后数组的容量
		int capacity = newCapacity(minCapacity); 
		//创建一个新的数组
		Object[] newElementData = new Object[capacity];
		//拷贝到新的数组
		System.arraycopy(this.elementData, 0, newElementData, 0, size);
		
		return newElementData;
	}
	//计算扩容后的数组容量
	private int newCapacity(int minCapacity) {
        // 当前数组的容量
        int oldCapacity = elementData.length;
        //扩展至1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 如果1.5倍小于 size+1
        if (newCapacity - minCapacity <= 0) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
            {
            	//取默认容量10 或 size + 1中的最大值
                int capacity =  Math.max(DEFAULT_CAPACITY, minCapacity);
                System.out.println("数组扩容:  " + oldCapacity + " -> " + capacity);
                return capacity;
            }
            //如果size+1超过了int的最大值，则抛出异常
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            System.out.println("数组扩容:  " + oldCapacity + " -> " + minCapacity);
            //否则因为1.5倍小于size+1，则返回size+1
            return minCapacity;
        }
        //判断1.5倍是否大于int最大值，如果小于则返回1.5倍，否则只能返回int的最大值了
        int capacity = (newCapacity - Integer.MAX_VALUE <= 0)
            ? newCapacity
            : Integer.MAX_VALUE;
        System.out.println("数组扩容:  " + oldCapacity + " -> " + capacity);
        return capacity;
    }
	
	
}
