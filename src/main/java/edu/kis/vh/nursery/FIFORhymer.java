package edu.kis.vh.nursery;
/*
*   klasa FIFORhymer dziedziczy po klasie DefaultCountingOutRhymer
*   klasa FIFORhymer nadpisuje metodę countOut
*   klasa FIFORhymer posiada jedno pole typu DefaultCountingOutRhymer
* */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
/*
* przedstawiona poniżej metoda countOut odpowiada za
* zwrócenie oraz usunięcie pierwszego elementu z tablicy numbers
* w przypadku pustej tablicy zwraca -1
* */
    
    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
