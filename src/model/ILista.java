package model;

public interface ILista<T> {
	public boolean isEmpty();
	public int size();
	public void addFirst(T dado);
	public void addLast(T dado) throws Exception;
	public void add(T valor, int posicao) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int posicao) throws Exception;
	public T get(int posicao) throws Exception;
	public void inverterLista() throws Exception;
	public void exibirLista() throws Exception;
}
