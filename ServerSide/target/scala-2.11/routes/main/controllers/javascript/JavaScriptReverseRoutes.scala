
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/erunandesu26/Documents/PRTravelServer/conf/routes
// @DATE:Thu Nov 17 01:10:28 AST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseRegisterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisterController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def getAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAdmin"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseSearchBarController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchBarController.search",
      """
        function(find0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("find", find0)])})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseCalendarController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getProfileCalendar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalendarController.getProfileCalendar",
      """
        function(userID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getProfileCalendar" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("userID", userID0)])})
        }
      """
    )
  
    // @LINE:41
    def getCalendar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalendarController.getCalendar",
      """
        function(userID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getCalendar" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("userID", userID0)])})
        }
      """
    )
  
  }

  // @LINE:29
  class ReversePictureController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getPictures: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PictureController.getPictures",
      """
        function(albumID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getPictures" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("albumID", albumID0)])})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseNewsfeedController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def getNewsfeedInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsfeedController.getNewsfeedInfo",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNewsfeedInfo" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("user", user0)])})
        }
      """
    )
  
    // @LINE:35
    def getProfileInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsfeedController.getProfileInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getProfileInfo"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAlbumController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def getAlbums: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AlbumController.getAlbums",
      """
        function(userID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAlbums" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("userID", userID0)])})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseNotificationsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getNotifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NotificationsController.getNotifications",
      """
        function(userID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getNotifications" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("userID", userID0)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function(user0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("user", user0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseWishListController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getWishList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WishListController.getWishList",
      """
        function(userID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getWishList" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("userID", userID0)])})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseAttractionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getAttractionsDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AttractionController.getAttractionsDetail",
      """
        function(attractionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAttractionsDetail" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("attractionID", attractionID0)])})
        }
      """
    )
  
    // @LINE:47
    def getAttractions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AttractionController.getAttractions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAttractions"})
        }
      """
    )
  
  }


}
