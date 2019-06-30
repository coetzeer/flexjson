package flexjson.mock.wizards;

import flexjson.JSONTypeHierarchy;
import flexjson.TypeMapping;

@JSONTypeHierarchy(typeFieldName = "type", typeMappings = {
        @TypeMapping(value = "fireball", type = Fireball.class),
        @TypeMapping(value = "heal", type = Heal.class )
})
public interface Spell {

    public String getType();

    public void cast( Player target );

}
