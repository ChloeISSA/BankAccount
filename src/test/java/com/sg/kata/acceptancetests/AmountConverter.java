package com.sg.kata.acceptancetests;

import java.lang.reflect.Type;

import org.jbehave.core.steps.ParameterConverters.ParameterConverter;

import com.sg.kata.domain.Amount;

public class AmountConverter implements ParameterConverter {

	@Override
	public boolean accept(Type type) {
		if (type instanceof Class<?>) {
			return Amount.class.isAssignableFrom((Class<?>) type);
		}
		return false;
	}

	@Override
	public Object convertValue(String value, Type type) {
		return Amount.amountOf(Integer.valueOf(value));
	}

}
