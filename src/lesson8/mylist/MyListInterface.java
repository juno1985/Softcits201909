package lesson8.mylist;
/**
 * 数组可以存任意类型 - 泛型
 * 数组的大小可伸缩
 * 	1. 数组容量可以动态增长
 * 
 * 目前数组初始化需要指定大小，如果今后随着业务增长数组频繁增加，如何解决?
 * 
 * 每次扩容 扩大到原来的1.5倍
 * 
 *
 */
public interface MyListInterface<E> {
	//数组里增加元素
	boolean add(E e);
	
	//返回数据长度
	Integer size();

}
