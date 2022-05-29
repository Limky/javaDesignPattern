package chapter04.condition.impl;

import chapter04.condition.Condition;

public class SurgeryCondition implements Condition{

	@Override
	public String getConditionName() {
		return "수술비 특약";
	}

}
