import java.util.Random;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefenceType ;

    public  void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt(1);
        if(randomIndex==1){
            bossDefenceType = getBossDefenceType();
        }

        else {
            bossDefenceType = "Universal";
        }
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
}
