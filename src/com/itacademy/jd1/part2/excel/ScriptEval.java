package com.itacademy.jd1.part2.excel;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEval {
	private static ScriptEngineManager m;
	private static ScriptEngine e;
	private static CompiledScript compiledScript;
	private static String[] func1Names = new String[] { "abs", "acos", "asin", "atan", "ceil", "cos", "exp", "floor",
			"log", "random", "round", "sin", "sqrt", "tan" };
	private static String[] func2Names = new String[] { "atan2", "max", "min", "sum" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		m = new ScriptEngineManager();
		e = m.getEngineByExtension("js");
		Compilable jsCompiler = (Compilable) e;
		try {
			for (String func : func1Names) {
				e.eval(String.format("function %1$s(x){return Math.%1$s(x);}", func));
			}
			for (String func : func2Names) {
				e.eval(String.format("function %1$s(x,y){return Math.%1$s(x,y);}", func));
			}
			compiledScript = jsCompiler.compile("max(c,b,x) + 10");
			e.put("x", 10);
			e.put("c", 2);
			e.put("b", 3);
			Double result = (Double) compiledScript.eval(e.getContext());
			System.out.println(result);
		} catch (ScriptException e1) {
			e1.printStackTrace();
		}
	}
}
