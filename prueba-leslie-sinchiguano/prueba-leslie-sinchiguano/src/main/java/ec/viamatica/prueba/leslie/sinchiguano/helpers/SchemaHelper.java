package ec.viamatica.prueba.leslie.sinchiguano.helpers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import ec.viamatica.prueba.leslie.sinchiguano.exceptions.MyException;
import org.springframework.stereotype.Component;

import javax.xml.validation.Schema;

import java.io.InputStream;

import static ec.viamatica.prueba.leslie.sinchiguano.enums.MessageUtil.JSONSCHEMA;

@Component
public class SchemaHelper {
    private JsonSchema readJsonSchema(String path) throws MyException {
        try {
            InputStream schemaJson = SchemaHelper.class.getResourceAsStream(path);
            //DEFINIR EL OBJETO EN BASE AL JSONCHEMA
            JsonSchema jsonSchema = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4).getSchema(schemaJson);
            return jsonSchema;
        } catch (Exception ex) {
            throw new MyException(JSONSCHEMA.getCode(), JSONSCHEMA.getMessage());
        }
    }

    public <T> void validateJsonSchema(String path, T entity) {
        try {

        } catch (Exception e){

        }
    }
}
