import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class randomEvents {
    public static void main( String[] args ) {
        String[] event_type = { "new_user", "new_session", "new_points"};
        String[] device_type = {"android", "iphone", "windows"};
        String[] resolution = {"640×960", "320×480", "960x720", "640x480"};
        String[] carrier = {"att", "verizon", "tmobile", "rogers"};
        int points = 0;        

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        
        String today = dateFormat.format(date);

        int event_type_length = event_type.length;
        int device_type_length = device_type.length;
        int resolution_length = resolution.length;
        int carrier_length = carrier.length;

        int event_type_index = 0;
        int device_type_index = 0;
        int resolution_index = 0;
        int carrier_index = 0;

        int sleep_length = 0;

        while (true) {
            event_type_index = new Random().nextInt(event_type_length);
            device_type_index = new Random().nextInt(device_type_length);
            resolution_index = new Random().nextInt(resolution_length);
            carrier_index = new Random().nextInt(carrier_length);

            sleep_length = new Random().nextInt(500);

            points = 0;
            date = new Date();
            today = dateFormat.format(date);

            if (event_type[event_type_index].equals("new_points")) {
                while ( points == 0 ) {
                    points = new Random().nextInt(50);
                }
            }

            System.out.printf("%s %s %s %s %s %d\n", event_type[event_type_index],
                                                device_type[device_type_index],
                                                resolution[resolution_index],
                                                carrier[carrier_index],
                                                today,
                                                points);
            try {
                Thread.sleep(sleep_length);
            } catch (InterruptedException e) {
            }
        }
    }
}
