package com.intexsoft.classwork.lection7.innerclass;

public class Test {

	public static void main(String[] args) {
		int localVar = 10;
		IFunction action1 = new IFunction() {
			@Override
			public void doAction() {
				int j = localVar;// ��� ���������� ���������
				System.out.println("action1 " + localVar);
			}
		};
		IFunction action2 = new IFunction() {
			@Override
			public void doAction() {
				System.out.println("action2 ");
			}
		};
		IFunction action6 = () -> System.out.println("action1 ");// 8-� java �������� ������, ���� ���������
																	// � ���� �����.(� ������� ����� ���������
																	// ������������ ����������)

		SomeAbstractObject action3 = new SomeAbstractObject() {
			@Override
			public void doAction() {
				System.out.println("action2 ");
			}
		};

		SomeObject2 action4 = new SomeObject2();
		SomeObject2 action5 = new SomeObject2() {
			@Override
			public void doAction() {
				System.out.println("overriden logic");// � ������ ������� �� ��������� ����� ��-�������
			}
		};
		execute(action1);// action1 - ������, � ������� "����������" �������.
		execute(action2);
	}

	private static void execute(IFunction actionHolder) {
		actionHolder.doAction();

	}

}
