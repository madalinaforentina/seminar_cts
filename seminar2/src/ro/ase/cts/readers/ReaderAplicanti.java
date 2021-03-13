package ro.ase.cts.readers;
import ro.ase.cts.clase.Aplicant;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicanti {
	public String fileName;
	
	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public abstract List<Aplicant>readAplicanti(String fileName) throws FileNotFoundException;
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
