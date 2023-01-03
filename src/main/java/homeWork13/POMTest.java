package homeWork13;

import org.junit.Test;

public class POMTest extends BaseClass{

    @Test
public void getTitle(){
        pageObjectModel.getCourseTitle();
    }

    @Test
    public void getRate(){
        pageObjectModel.getCourseRate();
    }
    @Test
    public void getDescription() throws InterruptedException {
        pageObjectModel.getCourseDescription();
    }
}
