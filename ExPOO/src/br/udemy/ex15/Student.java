package br.udemy.ex15;

import java.util.Objects;

public class Student {
	private int codigo;
	
	public Student() {
	}
	
	public Student(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Student [codigo=" + codigo + "]";
	}
}
