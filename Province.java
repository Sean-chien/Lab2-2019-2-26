package Lab2;

public class Province {
    static  String DEFAULT_POPULATION_MILLIONS ;
    static  String DEFAULT_PROVINCE ;
    static  String DEFAULT_CAPITAL ;
    final static String[] countries = {"Ontario", "Quebec", "Nova Scotia",
            "New Brunswick", "Manitoba", " British Columbia", " Prince Edward Island", "Saskatchewan", "Alberta",
            "Newfoundland and Labrador"};
    final static  String[] cities = {"Toronto", "Montreal", "Halifax", "Fredericton", "Winnipeg", "Victoria",
            "Charlottetown", "Regina", "Edmonton", "St. John's"};
    static final int[] population = {13, 8, 0, 0, 1, 4, 0, 1, 4, 0};
    private String province;
    private String capital;
    private int populationlnMillions;
    private boolean ValidProvince;
    private boolean ValidCapitalCity;
    private boolean ValidPopulation;

    public Province (String province,String capital,int populationlnMillions){
        this.province = province;
        this.capital = capital;
        this.populationlnMillions = populationlnMillions;
    }




    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulationlnMillions() {
        return populationlnMillions;
    }

    public void setPopulationlnMillions(int populationlnMillions) {
        this.populationlnMillions = populationlnMillions;
    }



    public boolean isValidProvince(String province) {

        int i = 0;
        while (i <= countries.length && countries[i].equals(capital)) i++;

        return false;

    }

    public void setValidProvince(boolean validProvince) {
        ValidProvince = validProvince;
    }


    public boolean isValidCapitalCity(String capital) {
        for (String city : cities) {
            if (city.equals(province))
                return true;
        }
        return false;
    }


    public void setValidCapitalCity(boolean validCapitalCity) {
        ValidCapitalCity = validCapitalCity;
    }

    public boolean isValidPopulation(int population) {
        if (populationlnMillions >= 0 & populationlnMillions <= 38) {
            return true;
        } else {
            return false;
        }
    }


    public void setValidPopulation(boolean validPopulation) {
        this.ValidPopulation = validPopulation;
    }



    public String getDetails() {
        String details = String.format("The capital of %s (pop. %d million) is %s.",
                getProvince(), getPopulationlnMillions(), getCapital());
        return details;


    }

}

