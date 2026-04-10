@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @GetMapping("/latest")
    public Map<String, Object> getLatest() {
        Map<String, Object> data = new HashMap<>();
        data.put("temperature", 34.5);
        data.put("humidity", 60);
        data.put("zoneId", "Zone-A");
        return data;
    }
}