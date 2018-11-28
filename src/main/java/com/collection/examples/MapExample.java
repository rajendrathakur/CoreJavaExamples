package com.collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("D", 40);
		items.put("B", 20);
		items.put("A", 10);
		items.put("C", 30);
		// items.put(null, 50);
		items.put("F", null);
		// items.put(null, 60);

		System.out.println("<----Iterating through enhanced for loop");

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		System.out.println("<----Iterating through keySet()");
		for (String key : items.keySet()) {
			System.out.println("Key is " + key + " value is " + items.get(key));
		}

		System.out.println("<----Iterating through java8 style");
		items.forEach((k, v) -> System.out.println("Item : " + k + " value : " + v));

		Map<String, Integer> treeMap = new TreeMap<>(items);
		System.out.println("<----Iterating treemap through java8 style");
		treeMap.forEach((k, v) -> System.out.println("Item : " + k + " value : " + v));

		Map<String, Integer> treeMapComp = new TreeMap<>((String o1, String o2) -> (o2.compareTo(o1)));
		treeMapComp.putAll(items);
		System.out.println("<----Iterating treemap through java8 style comparator");
		treeMapComp.forEach((k, v) -> System.out.println("Item : " + k + " value : " + v));

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);
		Set<Entry<String, Integer>> set = map.entrySet();

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}

		System.out.println("<-----iTERATING VALUES IN A DIFFERENT WAY");
		TreeSet<Entry<String, Integer>> treeset = new TreeSet<Entry<String, Integer>>((Map.Entry<String, Integer> o1,
				Map.Entry<String, Integer> o2) -> (o2.getValue()).compareTo(o1.getValue())

		);
		treeset.addAll(set);
		for (Map.Entry<String, Integer> entry : treeset) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}

	}

}
