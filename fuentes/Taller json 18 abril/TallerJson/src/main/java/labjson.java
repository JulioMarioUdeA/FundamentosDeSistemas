import org.json.XML;
import org.json.*;

public class labjson {
    public static int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING_NUEVO=
            "<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n"+
                    " <peliculas>\n"+
                    " <pelicula>\n"+
                    " <nombre>Interestelar</nombre>\n"+
                    " <estreno>26-oct-2014</estreno>\n"+
                    " <descripcion>\n"+
                    " El mundo azotado por una plaga necesita un viajero del espacio-tiempo\n"+
                    " </descripcion>\n"+
                    " <reparto>\n"+
                    " <actor>Matthew McConaughey</actor>\n"+
                    " <actor>Anne Hathaway</actor>\n"+
                    " <actor>Jessica Chastain</actor>\n"+
                    " <actor>Michael Caine</actor>\n"+
                    " </reparto>\n"+
                    " <director>Christopher Nolan</director>\n"+
                    " </pelicula>\n"+
                    " <pelicula>\n"+
                    " <nombre>Buscando a Nemo</nombre>\n"+
                    " <estreno>30-may-2003</estreno>\n"+
                    " <descripcion>\n"+
                    " Marlin debera viajar por los oceanos en busca de Nemo su hijo\n"+
                    " </descripcion>\n"+
                    " <reparto>\n"+
                    " <actor>Albert Brooks</actor>\n"+
                    " <actor>Alexander Gould</actor>\n"+
                    " <actor>Ellen DeGeneres</actor>\n"+
                    " </reparto>\n"+
                    " <director>Andrew Stanton</director>\n"+
                    " </pelicula>\n"+
                    " </peliculas>";
    public static String XML_STRING =
            "<?xml version = \"1.0\" encoding = \"UTF-8\"?>\n"+
                    " <menu_desayuno>\n"+
                    " <opcion>\n"+
                    " <nombre>PanCakes</nombre>\n"+
                    " <valor>$2.95</valor>\n"+
                    " <descripcion>\n"+
                    " Lithuanian Pancake Recipe - Blynai or Sklindziai\n"+
                    " </descripcion>\n"+
                    " <Kcal>500</Kcal>\n"+
                    " </opcion>\n"+
                    " <opcion>\n"+
                    " <nombre>Belgian Waffles</nombre>\n"+
                    " <valor>$5.95</valor>\n"+
                    " <descripcion>\n"+
                    " Two of our famous Belgian Waffles with plenty of real maple syrup\n"+
                    " </descripcion>\n"+
                    " <Kcal>650</Kcal>\n"+
                    " </opcion>\n"+
                    " <opcion>\n"+
                    " <nombre>Strawberry Belgian Waffles</nombre>\n"+
                    " <valor>$7.95</valor>\n"+
                    " <descripcion>\n"+
                    " Light Belgian Waffles covered with strawberries and whipped cream\n"+
                    " </descripcion>\n"+
                    " <Kcal>900</Kcal>\n"+
                    " </opcion>\n"+
                    " </menu_desayuno>";

    public static void main(String[] args){
        try{
            JSONObject jsobtect = XML.toJSONObject(XML_STRING_NUEVO);
            String jsonPretty = jsobtect.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.print(jsonPretty);
        }catch (JSONException jex){
            System.out.print(jex.toString());
        }
    }
}
