package chapter04.factorty;

import java.util.ArrayList;
import java.util.List;

import chapter04.condition.Condition;

public interface ProductPropertyFactory {
	
	public List<Condition> createCondition();

}
