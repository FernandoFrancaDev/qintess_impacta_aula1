package exemplo.loops;

public class LabCopaMundo {

	public static void main(String[] args) {
		// Criar o loop para interar sobre os anos de realização das copas
		for (int ano = 1930; ano <=2022; ano += 4) {
			// passo 3 desconsiderando os anos 1942 e 1946
			if(ano == 1942 || ano == 1946) {
				// saltamos a exibição desses valores e continuamos com o loop
				continue;
			}
			// exibindo os valores
			System.out.println("Copa do mundo de : " + ano );
		}
	

	}

}
