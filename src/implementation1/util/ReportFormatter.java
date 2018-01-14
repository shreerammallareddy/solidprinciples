package implementation1.util;

public class ReportFormatter {

    private FormatType formatType;
    private Object object;
    private String formattedOutput;

    public ReportFormatter(){}

    public ReportFormatter(FormatType formatType, Object object) {
        this.formatType = formatType;
        this.object = object;
    }

    public String getFormattedValue() {
        switch (formatType) {
            case XML:
                formattedOutput= convertObjectToXml(object);
                break;
            case CSV:
                formattedOutput= convertObjectToCsv(object);
            break;
            default:
                formattedOutput= "Incorrect Input";
                break;
        }
        return formattedOutput;
    }
    private String convertObjectToXml(Object object){
        return "<title>\n"+object.toString()+"\n</title> " ;
    }

    private String convertObjectToCsv(Object object){
        return ",,,,,\n"+object.toString()+"\n,,,,, " ;
    }
}
