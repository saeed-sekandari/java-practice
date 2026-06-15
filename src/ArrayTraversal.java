public class ArrayTraversal {
    public static void arrNames() {
        String[] names = {"Saeed", "Yasamin", "Ghulam", "Ali Ahmad", "Madin"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ",");
        }
    }
    //Searching for an element
    public static void searchForNames(String NameToBeFound){
        String[] names = {"Saeed", "Yasamin", "Ghulam", "Ali Ahmad", "Madin"};
        for(int i = 0; i < names.length; i++ ){
            if( names[i] == NameToBeFound){
                System.out.println(NameToBeFound + " is found, it is on index " + i);
                return;
            }
        }
        System.out.println(NameToBeFound + " is not found!");
    }

}
