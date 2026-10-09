package Rpg;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class DBmanager {
    private final String file_name = "src/Rpg/fighters.json";
    private ObjectMapper mapper = new ObjectMapper();
    public void saveAll(HashMap<String, Fighter> storage){
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(file_name), storage);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public HashMap<String, Fighter> loadAll(){
        File file = new File(file_name);
        if(!file.exists()) return new HashMap<>();
        try{
            return mapper.readValue(file, mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Fighter.class));
        }
        catch(IOException e){
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
