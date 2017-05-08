package com.mbronshteyn.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import com.mbronshteyn.ws.User;


/**
 * Created by mbronshteyn on 4/24/17.
 */
@Path("/user")
public class UserWS {

    @POST
    public void addUser( User user ){

    }
}
