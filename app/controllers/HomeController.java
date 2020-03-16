package controllers;

import play.mvc.*;
import play.twirl.api.Html;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        // return ok(views.html.index.render());
        // return ok("REST API with Play by Baeldung");
        // return ok(Html.apply("<h1>This text will appear as a heading 1</h1>"));

        // text/html or text/plain or application/json.
        // return ok("This is some text content").as("text/html");
        // return ok("This is some text content").as("text/html").withHeader("Header-Key", "Some value");
        // return ok("<h1>This is some text content</h1>").as("text/plain").withHeader("Header-Key", "Some value");
        return ok("{ \"name\":\"John\", \"age\":30, \"car\":null }").as("application/json").withHeader("Header-Key", "Some value");
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

// http://localhost:9000/hello?name=ceasar
    public Result hello(String name) {
        return ok(views.html.hello.render(name));
    }
}
