package com.frame;

import java.util.ArrayList;

import com.vo.DataVO;

public interface Dao<K,V> {
	public void insert(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public void update(V v) throws Exception;

}
