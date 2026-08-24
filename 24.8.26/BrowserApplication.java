package collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import java.util.Iterator;
public class BrowserApplication {
 Stack<String> a=new Stack <>();
 void visit(String url)
 {
     a.push(url);
 }

void back()
{
	if(a.isEmpty())
	{
		System.out.println("the stack is empty");
		return;
		
	}
	a.pop();
	
}
String getBack()
{
	if(a.isEmpty()) {
		System.out.println("empty");
		return null;
	}
	else
		
	
	{
	return a.peek();
	}
	
}
void showAllHistory() {
	if(a.isEmpty()){
		System.out.println("empty");
	}
	ListIterator<String> iterator=a.listIterator(a.size());
	while(iterator.hasPrevious())
	{
		 String element=iterator.previous();
		System.out.println(element);
	}
}
}
