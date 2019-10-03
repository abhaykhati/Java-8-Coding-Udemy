package java_8_code.data;

import java.util.Optional;

public class Country {
	Optional<PrimeMinister> primeMinister;

	public Country() {
	}

	public Country(Optional<PrimeMinister> primeMinister2) {
		this.primeMinister = primeMinister2;
	}

	public Optional<PrimeMinister> getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(Optional<PrimeMinister> primeMinister) {
		this.primeMinister = primeMinister;
	}

}
