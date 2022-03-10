package legacy.mpa
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')

class HomeController {
    def index() { 
        render "afdshfau"
    }
}
