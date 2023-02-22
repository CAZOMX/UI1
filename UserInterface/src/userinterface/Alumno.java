package userinterface;

public class Alumno
{

    private String nombre;
    private String apellido;
    private int registro;

    public Alumno()
    {
        this.nombre = "nombre";
        this.apellido = "apelido";
        this.registro = 1;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getRegistro()
    {
        return registro;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setRegistro(int registro)
    {
        this.registro = registro;
    }

}
