package Lab2;

public class Country {
    private String name;
    private Province[] provinces = new Province[10];

    public Country() {
        this.name = "Canada";
        this.provinces = new Province[]{
                new Province("British Columbia", "Victoria", 4),
                new Province("Ontario", "Toronto", 13),
                new Province("Quebec", "Montreal", 8),
                new Province("Nova Scotia", "Halifax", 0),
                new Province("New Brunswick", "Fredericton", 0),
                new Province("Manitoba", "Winnipeg", 1),
                new Province("Prince Edward Island", "Charlottetown", 0),
                new Province("Saskatchewan", "Regina", 1),
                new Province("Alberta", "Edmonton", 4),
                new Province("Newfoundland and Labrador", "St. John's", 0)
        };
    }

    public void displayAllProvinces() {
        for(Province elem: this.provinces){
            System.out.println(elem.getDetails());
        }
    }

    public int howManyPeople(int min,int max) {
        int People = 0;
        for(Province elem: this.provinces) {
            if(elem.getPopulationlnMillions() >= min & elem.getPopulationlnMillions() <= max) {
                People++;
            }
        }
        return People;
    }
}
