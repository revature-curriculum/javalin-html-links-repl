import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/eagle", ctx -> ctx.render("eagle.jte"));

        app.get("/parrot", ctx -> ctx.render("parrot.jte"));

    }
}
