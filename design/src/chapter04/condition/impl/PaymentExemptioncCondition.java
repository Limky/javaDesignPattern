package chapter04.condition.impl;

import chapter04.condition.Condition;

public class PaymentExemptioncCondition implements Condition{

	@Override
	public String getConditionName() {
		return "납입면제 특약";
	}

}
