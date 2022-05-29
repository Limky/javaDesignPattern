package chapter04.factorty.impl;

import java.util.ArrayList;
import java.util.List;

import chapter04.condition.Condition;
import chapter04.condition.impl.CareCondition;
import chapter04.condition.impl.SurgeryCondition;
import chapter04.factorty.ProductPropertyFactory;

public class OnsureProductPropertyFactory implements ProductPropertyFactory{

	@Override
	public ArrayList<Condition> createCondition() {
		ArrayList<Condition> list = new ArrayList<>();
		list.add(new SurgeryCondition()); //수술비 특약
		list.add(new CareCondition()); //간병비 특약
		
		return list;
	}

}
