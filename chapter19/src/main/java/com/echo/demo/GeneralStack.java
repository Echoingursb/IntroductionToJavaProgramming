package com.echo.demo;

import java.util.ArrayList;

public class GeneralStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    /**
     * @return 返回栈中元素的数目
     */
    public int getSize() {
        return list.size();
    }

    /**
     * @return 返回栈顶元素
     */
    public E peek() {
        return list.get(getSize() - 1);
    }

    /**
     * @return 返回并移除栈顶元素
     */
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(o);
        return o;
    }

    /**
     * @param o 添加一个新的元素到栈顶
     */
    public void push(E o) {
        list.add(o);
    }

    /**
     * @return 如果栈为空则返回true
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
