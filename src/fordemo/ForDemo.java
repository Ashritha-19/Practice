package fordemo;

public class ForDemo {
  public static void main(String[]args){

        int array[] = {3,4,1,5};



        for (int index=0;index< array.length;index++){

            for (int j = index+1; j < array.length; j++){

                if(array[index] > array[j]){

                   int temp = array[index]; // assigning (array[index]) value 3 to temp
                  array[index] = array[j]; //assigning (array[j] value 1 to (array[index]) value 3 :-[1,4,1,5]
                    array[j] = temp; //assigning (temp) value 3 to (array[j]) value 1 :-[1,4,3,5]

                }
            }
            System.out.println(array[index]);
        }
    }


}
