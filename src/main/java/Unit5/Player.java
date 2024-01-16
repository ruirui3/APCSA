package Unit5;

// Have to get rid of package statement

public class Player {
    private static int numPlayers = 0;
    private int x;
    private int y;
    private int z;
    private int direction = 1;
    private int hp;
    private String name;

    public Player() {
        this("P" + (numPlayers + 1), 0, 0, 0);

    }

    public Player(String name, int x, int y, int z) {
        this(name, x, y, z, 20, 1);
    }

    public Player(String name, int x, int y, int z, int hp, int direction) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        setHp(hp);
        setDirection(direction);
        numPlayers++;
    }

    // Accessors

    public static int getNumPlayers() {
        return numPlayers;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getHp() {
        return hp;
    }

    public int getDirection() {
        return direction;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Health: " + hp + "\n" +
                "Coordinates: X " + x + " Y " + y + " Z " + z + "\n" +
                "Direction: " + direction;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setDirection(int direction) {
        if (direction >= 1 && direction <= 6) {
            this.direction = direction;
        }
    }

    public void move(int direction, int units) {
        if (direction == 1) {
            x += units;
        } else if (direction == 2) {
            x -= units;
        } else if (direction == 3) {
            y += units;
        } else if (direction == 4) {
            y -= units;
        } else if (direction == 5) {
            z += units;
        } else {
            z -= units;
        }

    }

    public void teleport(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public void teleport(Player givenPlayer) {
        this.teleport(givenPlayer.getX(), givenPlayer.getY(), givenPlayer.getZ());
    }

    public void attack(Player player, int damage) {
        player.setHp(player.getHp() - damage);
        this.setHp(this.hp + (damage / 2));
    }

    public double getDistance(int x, int y, int z) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z, 2));
    }

    public double getDistance(Player player) {
        return this.getDistance(player.x, player.y, player.z);
    }

    // public static void main(String[] args) {
    // Player player = new Player();
    // System.out.println(player);
    // }

}
