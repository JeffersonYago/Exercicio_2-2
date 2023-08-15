package controller;
public class DivisaoController {

	public DivisaoController() {
		super();
	}
	public int Divis(int a, int b) {
		if (a < b) {
// quando "a" for menor que "b", significa que não é mais possível substrair um pelo outro, encerrando a chamada da função
			return 0;
		}
		else {
			a = a - b;
// enquanto for possível, "a"(dividendo) será subtraido pelo "b"(divisor) e somando 1 para cada vez que essa operação for realizada  
			return 1 + Divis(a,b);
		}
	}
}
