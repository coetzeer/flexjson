package flexjson.mock.superhero;

import flexjson.JSONTypeHierarchy;
import flexjson.TypeMapping;

import java.util.List;
import java.util.Arrays;

public class Hero {

    private SecretLair lair;
    private SecretIdentity identity;
    private String name;

    @JSONTypeHierarchy(typeFieldName = "type", typeMappings = {
            @TypeMapping(value="xray", type = XRayVision.class),
            @TypeMapping(value="flight", type = Flight.class),
            @TypeMapping(value="heat", type = HeatVision.class),
            @TypeMapping(value="invincible", type = Invincible.class)
    })
    private List<SuperPower> powers;

    protected Hero() {
    }

    public Hero(String name, SecretIdentity identity, SecretLair lair, SuperPower... powers) {
        this.name = name;
        this.identity = identity;
        this.lair = lair;
        this.powers = Arrays.asList( powers );
    }

    public SecretLair getLair() {
        return lair;
    }

    public SecretIdentity getIdentity() {
        return identity;
    }

    public String getName() {
        return name;
    }

    private void setLair(SecretLair lair) {
        this.lair = lair;
    }

    private void setIdentity(SecretIdentity identity) {
        this.identity = identity;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPowers(List<SuperPower> powers) {
        this.powers = powers;
    }

    public List<SuperPower> getPowers() {
        return powers;
    }
}
