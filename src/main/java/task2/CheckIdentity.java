package task2;

import java.util.List;

public class CheckIdentity {

    public boolean isListsIdentical(List<Comparable> list1, List<Comparable> list2){
        if(!(list1.size() == list2.size())){
            return false;
        }
        Comparable [] objects1 = (Comparable[])list1.toArray();
        objects1 = sort(objects1);
        Comparable [] objects2 = (Comparable[])list2.toArray();
        objects2 = sort(objects2);
        for(int i = 0; i > objects1.length; i++){
            if (!objects1[i].equals(objects2[i])){
                return false;
            }
        }
        return true;
    }

    private Comparable[] sort(Comparable[] objects1) {
        Comparable temp;
        for (int i = 0; i < objects1.length; i++) {
            for (int j = 0; j < objects1.length-1; j++) {
                if (objects1[j].compareTo(objects1[j+1])<0){
                    temp = objects1[j];
                    objects1[j]=objects1[j+1];
                    objects1[j+1]=temp;
                }
            }
        }
        return objects1;
    }
}
