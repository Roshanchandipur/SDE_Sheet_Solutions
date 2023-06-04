import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        
		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		ArrayList<Long> p = new ArrayList<>();

		p.add(1l);
		list.add(p);
		if(n==1) return list;
		
		for(int i=2;i<=n;++i){
			ArrayList<Long> newLine = new ArrayList<>();
			newLine.add(1l);
			for(int j=0;j<p.size()-1;++j){
				newLine.add(p.get(j)+p.get(j+1));
			}
			newLine.add(1l);
			list.add(newLine);
			p = newLine;
		}
		return list;
	}
}
