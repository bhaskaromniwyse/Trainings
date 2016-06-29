package com.test2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment2.ReversePrintingofList;
import com.assignment2.ListDataStructure;

public class TsetReversePrintingofList {

	@Test
	public void testreverseList() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ReversePrintingofList rls = new ReversePrintingofList();
		rls.reverseList(list);
		
	}

}
