package lesson8.mylist;

import java.util.Arrays;

/**
 * ConcreteMyList类是对数组进行封装，能够动态增长
 *
 */
public class ConcreteMyList<E> implements MyListInterface<E> {
	// 存放元素数组
	private Object[] elementData;

	// 用来初始化元素数组elementData
	private final static Object[] DEFAULT_ELEMENT_DATA = {};

	// 记载当前数组的数据长度
	private Integer size;

	public ConcreteMyList() {
		this.elementData = DEFAULT_ELEMENT_DATA;
		this.size = 0;
	}

	@Override
	public boolean add(E e) {
		// 判断扩容
		if (elementData.length == size) {
			elementData = grow();
		}

		elementData[size] = e;
		//增加一个元素后,当前元素长度+1
		size++;

		return true;
	}

	@Override
	public Integer size() {
		return this.size;
	}

	private Object[] grow() {
		//进行扩容，并把原来的数据拷贝过来
		return Arrays.copyOf(elementData, getNewCapacity());

	}

	//得到扩容后的数组长度
	private Integer getNewCapacity() {
		// 当前需要的最小容量
		Integer minCapacity = size + 1;
		// 每次扩容 扩大到原来的1.5倍
		Integer newCapacity = size + (size >> 1);
		// 如果新容量小于等于最小需要扩容的容量
		if (newCapacity <= minCapacity) {
			//最小容量超过Integer.MAX_VALUE
			if(minCapacity < 0) {
				System.out.println("数组已经达到最大容量不能再扩容");
				return -1;
			}
			return minCapacity;
		}
		// 1.5倍容量大于最小容量，则放回1.5倍容量
		return newCapacity;
	}

}
