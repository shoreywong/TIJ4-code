package innerclasses.ex6Base;

import innerclasses.ex6Interface.Ex6Interface;

public class Ex6Base {
	protected class Inner implements Ex6Interface {
		public Inner() {}
		@Override
		public void m() {
			System.out.println(1);
		}
	}
}
