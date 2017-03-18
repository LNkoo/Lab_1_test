import com.sun.org.apache.xpath.internal.operations.Bool;


/**
 * Created by Lena on 18.03.2017.
 */
public class Operations {
    Boolean x;
    Boolean y;
    Boolean result; // true=1 false=0

    public boolean and(boolean x, boolean y) { return result =  x&&y; } //додавання Х та У - кон'юнкція
    public boolean or(boolean x, boolean y)
    {
        return result = x||y;
    }   // множення Х на У - диз'юнкція
    public boolean notX(boolean x) { return result = (!x);} // заперечення Х - інверсія
    public boolean notY(boolean y) { return result = (!y);}  //заперечення У - інверсія
    public boolean xor(boolean x, boolean y) {return result = (x||y)&&(!x||!y);}// виключення АБО, result=1
    public boolean constOne(boolean x, boolean y) { return result = true;} // константа 1
    public boolean constZero(boolean x, boolean y) { return result = false;} // константа 0
    public boolean shtShef(boolean x, boolean y) { return result = !x||!y; } // штрих Шеффера
    public boolean impl(boolean x, boolean y) { return result = (!x)||y; } // імплікація
    public boolean nimpl(boolean x, boolean y) { return result = x&&(!y); } // обернена імплікація
    public boolean strPirs(boolean x, boolean y) { return result = !x&&!y;} // стрілка Пірса
    public boolean equiv(boolean x, boolean y) { return result = (x&&y)||(!x&&!y);} // операція еквівалентнсті


    //public boolean and(boolean x, boolean y) { return result =  x||y; } //додавання Х та У - кон'юнкція
    //public boolean or(boolean x, boolean y) {return result = x&&y;}   // множення Х на У - диз'юнкція
    //public boolean notX(boolean x) { return result = (x);} // заперечення Х - інверсія
    //public boolean notY(boolean y) { return result = (y);}  //заперечення У - інверсія
    //public boolean xor(boolean x, boolean y) {return result = (x||!y)&&(x||!y);}// виключення АБО, result=1
    //public boolean constOne(boolean x, boolean y) { return result = false;} // константа 1
    //public boolean constZero(boolean x, boolean y) { return result = true;} // константа 0
    //public boolean shtShef(boolean x, boolean y) { return result = !x||y; } // штрих Шеффера
    //public boolean impl(boolean x, boolean y) { return result = (!x)||!y; } // імплікація
    //public boolean nimpl(boolean x, boolean y) { return result = x&&(y); } // обернена імплікація
    //public boolean strPirs(boolean x, boolean y) { return result = !x&&y;} // стрілка Пірса
    //public boolean equiv(boolean x, boolean y) { return result = (x&&!y)||(!x&&!y);} // операція еквівалентнсті

}
