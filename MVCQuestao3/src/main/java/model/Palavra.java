package model;

public class Palavra {
    private String palavra;
    private boolean palindroma;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.palindroma = verificarPalindroma();
    }
    
    public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public boolean isPalindroma() {
		return palindroma;
	}

	public void setPalindroma(boolean palindroma) {
		this.palindroma = palindroma;
	}

    public boolean verificarPalindroma() {
		String palavraLowerCase = palavra.toLowerCase();
        int comprimento = palavraLowerCase.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavraLowerCase.charAt(i) != palavraLowerCase.charAt(comprimento - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
