public class CovidIFs {
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ){
        String diagnostico;
        if (bodyTemperature>= 38 && (difficultyBreathing || diabetes || cancer || isPregnant || isOver60yearsold || hepatic || kidnevDisease || respiratoryDisease)){
            diagnostico = "/diagnostico/"+provincia;
        }
        else if(bodyTemperature>= 38){
            diagnostico = "/cuarentena/";
        }
        else if (bodyTemperature < 38){
            diagnostico = "/diagnostico_bueno/";
        }
        else{
            diagnostico = "/diagnostico_bueno/";
        }
        return diagnostico;
    }
}
