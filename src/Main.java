public class Main
{
    public static void main(String[] args)
    {
        String[] arr = {"wheat", "honey", "sugar", "eggs", "nuts"};

        String allergy = "nuts";

        linearAllergyFoodSearch(arr, allergy);
    }

    public static int linearAllergyFoodSearch(String[] arr, String allergy)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (allergy.equals(arr[i]))
            {
                System.out.println("I found " + allergy + " listed as ingredient number #" + (i + 1) + ".");

                return 1;
            }
        }
        System.out.println("Element is not present in ingredients");

        return -1;
    }
}