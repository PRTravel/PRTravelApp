
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/erunandesu26/Documents/PRTravelServer/conf/routes
// @DATE:Thu Nov 17 01:10:28 AST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images/")))
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseRegisterController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
  }

  // @LINE:53
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def getAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAdmin")
    }
  
  }

  // @LINE:17
  class ReverseSearchBarController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def search(find:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("find", find)))))
    }
  
  }

  // @LINE:20
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def profile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
  }

  // @LINE:41
  class ReverseCalendarController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getProfileCalendar(userID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getProfileCalendar" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("userID", userID)))))
    }
  
    // @LINE:41
    def getCalendar(userID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getCalendar" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("userID", userID)))))
    }
  
  }

  // @LINE:29
  class ReversePictureController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getPictures(albumID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getPictures" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("albumID", albumID)))))
    }
  
  }

  // @LINE:35
  class ReverseNewsfeedController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getNewsfeedInfo(user:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getNewsfeedInfo" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("user", user)))))
    }
  
    // @LINE:35
    def getProfileInfo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getProfileInfo")
    }
  
  }

  // @LINE:26
  class ReverseAlbumController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getAlbums(userID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAlbums" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("userID", userID)))))
    }
  
  }

  // @LINE:32
  class ReverseNotificationsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getNotifications(userID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getNotifications" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("userID", userID)))))
    }
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def login(user:String, password:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("user", user)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
    }
  
  }

  // @LINE:23
  class ReverseWishListController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getWishList(userID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getWishList" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("userID", userID)))))
    }
  
  }

  // @LINE:47
  class ReverseAttractionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getAttractionsDetail(attractionID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAttractionsDetail" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("attractionID", attractionID)))))
    }
  
    // @LINE:47
    def getAttractions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getAttractions")
    }
  
  }


}
