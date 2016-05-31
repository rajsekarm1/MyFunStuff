package com.rajasekar.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OpticPgExample {

	public static void main(String[] args) {
		
		System.out.println(getOpticPgMap(getOpticPg()).keySet());
		String slotName = "slot-u1";
		System.out.println(slotName.substring(5));

	}
	
	private static List<OpticPg> getOpticPg(){
		List<OpticPg> pgList = new ArrayList<OpticPg>();
		OpticPg pg = new OpticPg();
		pg.setName("test");
		Set<String> unitsSet = new HashSet<String>();
		unitsSet.add("slot-u1");
		unitsSet.add("slot-u3");
		pg.setUnitList(unitsSet);
		pgList.add(pg);
		pg = new OpticPg();
		pg.setName("test1");
		unitsSet = new HashSet<String>();
		unitsSet.add("slot-u4");
		unitsSet.add("slot-u5");
		pg.setUnitList(unitsSet);
		pgList.add(pg);
		return pgList;
	}
	
	private static Map<String,OpticPg> getOpticPgMap(List<OpticPg> opgList){
    	
    	Map <String,OpticPg> opticPgMap = new HashMap<>();
    	opgList.forEach(opg -> {
    		Set<String> unitsList= opg.getUnitList();
    		unitsList.forEach(unit -> opticPgMap.put(unit,opg));
    	});
    	
    	return opticPgMap;
    }

}


class OpticPg {
	Set<String> mainUnits = null;
	Set<String> unitList = null;
	public Set<String> getUnitList() {
		return unitList;
	}
	public void setUnitList(Set<String> unitList) {
		this.unitList = unitList;
	}
	public Set<String> getMainUnits() {
		return mainUnits;
	}
	public void setMainUnits(Set<String> mainUnits) {
		this.mainUnits = mainUnits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	
	public String toString(){
		return "Main Unit:"+ mainUnits +" unitList:"+unitList + " name:"+name;
	}
	
}