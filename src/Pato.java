interface Pato {
    public String nome();
}

class patoDeBorracha implements Pato {
    public String  nome()
    {
        return("Este é o pato de borracha, ele somente nada\n");
    }
}

class patoDeMadeira implements Pato {
    public String  nome()
    {
        return("Este é o pato de madeira, ele somente anda\n");
    }
}

class patoVoador implements Pato {
    public String  nome()
    {
        return("Este é o pato voador, ele somente voa\n");
    }
}

class patoNormal implements Pato {
    public String  nome()
    {
        return("Este é o pato normal, ele voa, nada e anda\n");
    }
}
