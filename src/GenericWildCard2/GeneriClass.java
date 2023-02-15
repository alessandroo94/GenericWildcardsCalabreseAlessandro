package GenericWildCard2;

public class GeneriClass <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static <T> boolean isEquals(GeneriClass<T> sol1, GeneriClass<T> c2){
        return sol1.getT().equals(c2.getT());
    }
}
