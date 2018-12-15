package com.hamzahjamad.practice.chapter_23_concurrency;

public class ArrayWriter implements Runnable {

    private final ISimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, ISimpleArray array)
    {
        startValue = value;
        sharedSimpleArray = array;
    }

    @Override
    public void run()
    {
      for(int i = startValue; i < startValue + 3; i++)
      {
          sharedSimpleArray.add(i);
      }
    }
}
