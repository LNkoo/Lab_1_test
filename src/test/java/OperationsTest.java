
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Lena on 18.03.2017.
 */
public class OperationsTest {

    @Test
    public void and1() throws Exception {
        Operations op = new Operations();
        boolean result = op.and(true, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void and2() throws Exception {
        Operations op = new Operations();
        boolean result = op.and(true, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void and3() throws Exception {
        Operations op = new Operations();
        boolean result = op.and(false, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void and4() throws Exception {
        Operations op = new Operations();
        boolean result = op.and(false, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void or1() throws Exception {
        Operations op = new Operations();
        boolean result = op.or(true,true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void or2() throws Exception {
        Operations op = new Operations();
        boolean result = op.or(true, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void or3() throws Exception {
        Operations op = new Operations();
        boolean result = op.or(false, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void or4() throws Exception {
        Operations op = new Operations();
        boolean result = op.or(false, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void notX1() throws Exception {
        Operations op = new Operations();
        boolean result = op.notX(true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void notX2() throws Exception {
        Operations op = new Operations();
        boolean result = op.notX(false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void notY1() throws Exception {
        Operations op = new Operations();
        boolean result = op.notY(true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void notY2() throws Exception {
        Operations op = new Operations();
        boolean result = op.notY(false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void xor1() throws Exception {
        Operations op = new Operations();
        boolean result = op.xor(true,true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void xor2() throws Exception {
        Operations op = new Operations();
        boolean result = op.xor(true,false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void xor3() throws Exception {
        Operations op = new Operations();
        boolean result = op.xor(false,true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void xor4() throws Exception {
        Operations op = new Operations();
        boolean result = op.xor(false,false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void constOne1() throws Exception {
        Operations op = new Operations();
        boolean result = op.constOne(true, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void constOne2() throws Exception {
        Operations op = new Operations();
        boolean result = op.constOne(true, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void constOne3() throws Exception {
        Operations op = new Operations();
        boolean result = op.constOne(false, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void constOne4() throws Exception {
        Operations op = new Operations();
        boolean result = op.constOne(false, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void constZero1() throws Exception {
        Operations op = new Operations();
        boolean result = op.constZero(true, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void constZero2() throws Exception {
        Operations op = new Operations();
        boolean result = op.constZero(false, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void constZero3() throws Exception {
        Operations op = new Operations();
        boolean result = op.constZero(true, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void constZero4() throws Exception {
        Operations op = new Operations();
        boolean result = op.constZero(false, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void shtShef1() throws Exception {
        Operations op = new Operations();
        boolean result = op.shtShef(true, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void shtShef2() throws Exception {
        Operations op = new Operations();
        boolean result = op.shtShef(true, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void shtShef3() throws Exception {
        Operations op = new Operations();
        boolean result = op.shtShef(false, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void shtShef4() throws Exception {
        Operations op = new Operations();
        boolean result = op.shtShef(false, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void impl1() throws Exception {
        Operations op = new Operations();
        boolean result = op.impl(true, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void impl2() throws Exception {
        Operations op = new Operations();
        boolean result = op.impl(true, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void impl3() throws Exception {
        Operations op = new Operations();
        boolean result = op.impl(false, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void impl4() throws Exception {
        Operations op = new Operations();
        boolean result = op.impl(false, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void nimpl1() throws Exception {
        Operations op = new Operations();
        boolean result = op.nimpl(true, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void nimpl2() throws Exception {
        Operations op = new Operations();
        boolean result = op.nimpl(true, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void nimpl3() throws Exception {
        Operations op = new Operations();
        boolean result = op.nimpl(false, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void nimpl4() throws Exception {
        Operations op = new Operations();
        boolean result = op.nimpl(false, false);
        Assert.assertEquals(false, result);
    }



    @Test
    public void strPirs1() throws Exception {
        Operations op = new Operations();
        boolean result = op.strPirs(true, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void strPirs2() throws Exception {
        Operations op = new Operations();
        boolean result = op.strPirs(true, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void strPirs3() throws Exception {
        Operations op = new Operations();
        boolean result = op.strPirs(false, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void strPirs4() throws Exception {
        Operations op = new Operations();
        boolean result = op.strPirs(false, false);
        Assert.assertEquals(true, result);
    }

    @Test
    public void equiv() throws Exception {
        Operations op = new Operations();
        boolean result = op.equiv(true, true);
        Assert.assertEquals(true, result);
    }

    @Test
    public void equiv2() throws Exception {
        Operations op = new Operations();
        boolean result = op.equiv(true, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void equiv3() throws Exception {
        Operations op = new Operations();
        boolean result = op.equiv(false, true);
        Assert.assertEquals(false, result);
    }

    @Test
    public void equiv4() throws Exception {
        Operations op = new Operations();
        boolean result = op.equiv(false, false);
        Assert.assertEquals(true, result);
    }



}
