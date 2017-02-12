package main;


public class ArrayStructure
{

    private int[] theArray = new int[50];

    private int arraySize = 10;



    public void generateRandomArray()
    {
        for (int i = 0; i < arraySize; i++)
        {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }


    public void printArray()
    {
        System.out.println("------------");
        for (int i = 0 ; i < arraySize; i++)
        {
            System.out.print("| " + i + " | ");
            System.out.println("| " + theArray[i] + " | ");
            System.out.println("------------");
        }

    }
    

    public int getValueIndex(int index)
    {
        if (index < arraySize)
            return theArray[index];
        return 0;
    }



    public boolean doesArrayContainThisValue(int searchValue)
    {
        boolean valueInArray = false;
        for (int i =0; i < arraySize; i++)
        {
            if(theArray[i] == searchValue)
                valueInArray = true;
        }
        return valueInArray;
    }




    // Delete Array row for the index and move elements up
    public void deleteIndex(int index){

        if(index < arraySize){
            // Overwrite the value for the supplied index
            // and then keep overwriting every index that follows
            // until you get to the last index in the array

            for(int i = index; i < (arraySize - 1); i++)
            {
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }


    //insert an element at the end of the array
    public void insertIndex(int value)
    {
        if (arraySize < 50)
        {
            theArray[arraySize] = value;
            arraySize ++;
        }
    }

    // Insert an element at a specified index




    // Linear Search : Every index must be looked at
    public String linearSearchForValue(int value)
    {
        boolean valueInArray = false;
        String indexWithValue = "";
        System.out.print("The Value was found in the following: ");

        for (int i = 0; i < arraySize; i++)
        {
            if (theArray[i] == value)
            {
                valueInArray = true;
                System.out.print( i + " ");
                indexWithValue += i + " ";
            }
        }

        if (!valueInArray)
        {
            indexWithValue = "None";
            System.out.print(indexWithValue);
        }

        System.out.println();
        return indexWithValue;

    }


    public static void main(String[] args)
    {
        ArrayStructure newArray = new ArrayStructure();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueIndex(3));
        System.out.println(newArray.doesArrayContainThisValue(18));
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertIndex(19);
        newArray.printArray();
        newArray.linearSearchForValue(18);
    }
}
