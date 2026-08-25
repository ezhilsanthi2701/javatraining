package printerTask;
import java.util.ArrayDeque;
import java.util.Deque;

import collection.Order;
public class printerTask {
	Deque<Print>allPrint=new ArrayDeque<>();
	 void addTask(Print newNmae)
	 {
		 allPrint.add(newNmae);
	 }
	 void showAll()
	 {
	  for(Print pa:allPrint)
	  {
		  System.out.println(pa);
	  }
	 }
	 Print nextPrint() {
		  return allPrint.peek();
	  }
	  void removePrint() {
		  allPrint.poll();
	  }
	}

