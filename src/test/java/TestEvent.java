import event_mechanism.Event;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class TestEvent {
    private static final Logger log = Logger.getLogger(TestEvent.class);
    private Event event;

    @Test
    public  void testGetEvent() throws ParseException {
        event = new Event();
        log.info(event.getEvent());
//        switch (event.getEvent()){
//            case "MORNING": break;
//            case "DAY": break;
//            case "EVENING":break;
//            case "NIGHT": break;
//            default:
//                Assert.fail();
//        }
    }

    @Test
    public void testNightFirst()throws ParseException{
        event = new Event("23:00:00");
       // Assert.assertEquals(event.getEvent(), "NIGHT");
        log.info(event.getEvent());
    }

    @Test
    public void testNightSecond()throws ParseException{
        event = new Event("05:59:59");
        //Assert.assertEquals(event.getEvent(), "NIGHT");
        log.info(event.getEvent());
    }

    @Test
    public void testNightThree()throws ParseException{
        event = new Event("23:00:01");
        //Assert.assertEquals(event.getEvent(), "NIGHT");
        log.info(event.getEvent());
    }

    @Test
    public void testNightFour()throws ParseException{
        event = new Event("02:00:00");
        //Assert.assertEquals(event.getEvent(), "NIGHT");
        log.info(event.getEvent());
    }

    @Test
    public void testMorningFirst()throws ParseException{
        event = new Event("06:00:01");
        //Assert.assertEquals(event.getEvent(), "MORNING");
        log.info(event.getEvent());
    }

    @Test
    public void testMorningSecond()throws ParseException{
        event = new Event("08:59:59");
        //Assert.assertEquals(event.getEvent(), "MORNING");
        log.info(event.getEvent());
    }

    @Test
    public void testMorningThree()throws ParseException{
        event = new Event("07:25:01");
        //Assert.assertEquals(event.getEvent(), "MORNING");
        log.info(event.getEvent());
    }

    @Test
    public void testMorningFour()throws ParseException{
        event = new Event("08:00:00");
        //Assert.assertEquals(event.getEvent(), "MORNING");
        log.info(event.getEvent());
    }
    @Test
    public void testDayFirst()throws ParseException{
        event = new Event("09:00:01");
        //Assert.assertEquals(event.getEvent(), "DAY");
        log.info(event.getEvent());
    }

    @Test
    public void testDaySecond()throws ParseException{
        event = new Event("18:59:59");
        //Assert.assertEquals(event.getEvent(), "DAY");
        log.info(event.getEvent());
    }

    @Test
    public void testDayThree()throws ParseException{
        event = new Event("15:35:51");
        //Assert.assertEquals(event.getEvent(), "DAY");
        log.info(event.getEvent());
    }

    @Test
    public void testDayFour()throws ParseException{
        event = new Event("16:53:15");
        //Assert.assertEquals(event.getEvent(), "DAY");
        log.info(event.getEvent());
    }

    @Test
    public void testEveningFirst()throws ParseException{
        event = new Event("19:00:01");
        //Assert.assertEquals(event.getEvent(), "EVENING");
        log.info(event.getEvent());
    }

    @Test
    public void testEveningSecond()throws ParseException{
        event = new Event("22:59:59");
        //Assert.assertEquals(event.getEvent(), "EVENING");
        log.info(event.getEvent());
    }

    @Test
    public void testEveningThree()throws ParseException{
        event = new Event("21:25:01");
        //Assert.assertEquals(event.getEvent(), "EVENING");
        log.info(event.getEvent());
    }

    @Test
    public void testEveningFour()throws ParseException{
        event = new Event("22:00:00");
        //Assert.assertEquals(event.getEvent(), "EVENING");
        log.info(event.getEvent());
    }
}
