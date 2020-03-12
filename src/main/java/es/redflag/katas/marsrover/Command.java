package es.redflag.katas.marsrover;
//es un interfaz, pero como quiero probar la modiva del list lo dejo abstract y extiendo
public abstract class Command {

    protected String pattern = "NESW";

    void execute(){};
}
