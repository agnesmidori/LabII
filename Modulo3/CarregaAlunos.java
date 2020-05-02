import java.io.*;

public class CarregaAlunos {
	

	protected static Aluno constroiAluno (String linha) {
		String atributos [] = linha.split(",");
		Aluno a = new Aluno (atributos[0], Float.valueOf(atributos[1]), Float.valueOf(atributos[2]));
		return a;
	}
	
	public static Aluno [] carregaArquivo (String arquivo) throws IOException {
		Aluno alunos [] = new Aluno[5];
		FileReader fr = new FileReader (arquivo);
		BufferedReader br = new BufferedReader (fr);
		
		String linha;
		int cont = 0;
		while ((linha = br.readLine()) != null){
			Aluno a = constroiAluno (linha);
			alunos[cont] = a;
			cont++;
		}
		br.close();
		return alunos;
	}
	
	public static void main (String [] args) {
		try {
			Aluno a[] = carregaArquivo ("notaAlunos.txt");
			for (int i=0; i < a.length; i++) {
				System.out.println (a[i]);
			}
		}
			catch (IOException e) {
				e.printStackTrace ();
			}
		
	}
}

