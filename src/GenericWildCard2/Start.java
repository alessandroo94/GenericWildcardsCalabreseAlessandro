package GenericWildCard2;

public class Start {
    public static void main(String[] args) {
        GeneriClass<Integer> firstElement = new GeneriClass<>();
        GeneriClass<Integer> secondElement = new GeneriClass<>();
        GeneriClass<String> thirdElement = new GeneriClass<>();
        GeneriClass<String> fourthElement = new GeneriClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.println("First element is equal to second element? " + GeneriClass.isEquals(firstElement, secondElement));
        System.out.println("Third element is equal to fourth element? " + GeneriClass.isEquals(thirdElement, fourthElement));
     }
}
