public class Usuario {
    private String nombre;
    private String cedula;
    private String password;
    private int edad;
    private int cant_hijos;
    private float saldo;

    public Usuario(String nom, String cedId, String pass, int anios, int hijos){
        this.nombre=nom;
        this.cedula=cedId;
        this.password=pass;
        this.edad=anios;
        this.cant_hijos=hijos;
        this.saldo=0;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }
    public String getPassword(){
        return password;
    }
    public int getEdad(){
        return edad;
    }
    public int getCantHijos(){
        return cant_hijos;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void setCedula(String CId){
        this.cedula=CId;
    }
    public void setPassword(String contra){
        this.password=contra;
    }
    public void setEdad(int anios){
        this.edad=anios;
    }
    public void setCantHijos(int cantidad){
        this.cant_hijos=cantidad;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    @Override
    public boolean equals(Object obj){
        
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario user = (Usuario) obj;
        return saldo = user.saldo;
    }
