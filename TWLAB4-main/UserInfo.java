public class UserInfo {
    private String nume,varsta,inaltime,greutate;
    public altele altel;
    
    public UserInfo (String nume, String varsta,String inaltime,String greutate,altele xx) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        altel=xx;
    }

    public String getNume() {
        return this.nume;
    }


    public String getVarsta() {
        return this.varsta;
    }

    public String getInaltime() {
        return this.inaltime;
    }

    public String getGreutate() {
        return this.greutate;
    }

	public altele getAltel() {
		return altel;
	}

	public void setAltel(altele altel) {
		this.altel = altel;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(String varsta) {
		this.varsta = varsta;
	}

	public void setInaltime(String inaltime) {
		this.inaltime = inaltime;
	}

	public void setGreutate(String greutate) {
		this.greutate = greutate;
	}
    
    
    
}