package com.currencyconverter.module;

import java.util.HashMap;

public record Currency(HashMap<String, Double> conversion_rates) {
}
