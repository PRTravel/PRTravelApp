
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/erunandesu26/Documents/PRTravelServer/conf/routes
// @DATE:Thu Nov 17 01:10:28 AST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  LoginController_11: controllers.LoginController,
  // @LINE:11
  Assets_9: controllers.Assets,
  // @LINE:14
  RegisterController_5: controllers.RegisterController,
  // @LINE:17
  SearchBarController_10: controllers.SearchBarController,
  // @LINE:20
  ProfileController_4: controllers.ProfileController,
  // @LINE:23
  WishListController_6: controllers.WishListController,
  // @LINE:26
  AlbumController_1: controllers.AlbumController,
  // @LINE:29
  PictureController_3: controllers.PictureController,
  // @LINE:32
  NotificationsController_2: controllers.NotificationsController,
  // @LINE:35
  NewsfeedController_8: controllers.NewsfeedController,
  // @LINE:41
  CalendarController_7: controllers.CalendarController,
  // @LINE:47
  AttractionController_12: controllers.AttractionController,
  // @LINE:53
  AdminController_0: controllers.AdminController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    LoginController_11: controllers.LoginController,
    // @LINE:11
    Assets_9: controllers.Assets,
    // @LINE:14
    RegisterController_5: controllers.RegisterController,
    // @LINE:17
    SearchBarController_10: controllers.SearchBarController,
    // @LINE:20
    ProfileController_4: controllers.ProfileController,
    // @LINE:23
    WishListController_6: controllers.WishListController,
    // @LINE:26
    AlbumController_1: controllers.AlbumController,
    // @LINE:29
    PictureController_3: controllers.PictureController,
    // @LINE:32
    NotificationsController_2: controllers.NotificationsController,
    // @LINE:35
    NewsfeedController_8: controllers.NewsfeedController,
    // @LINE:41
    CalendarController_7: controllers.CalendarController,
    // @LINE:47
    AttractionController_12: controllers.AttractionController,
    // @LINE:53
    AdminController_0: controllers.AdminController
  ) = this(errorHandler, LoginController_11, Assets_9, RegisterController_5, SearchBarController_10, ProfileController_4, WishListController_6, AlbumController_1, PictureController_3, NotificationsController_2, NewsfeedController_8, CalendarController_7, AttractionController_12, AdminController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_11, Assets_9, RegisterController_5, SearchBarController_10, ProfileController_4, WishListController_6, AlbumController_1, PictureController_3, NotificationsController_2, NewsfeedController_8, CalendarController_7, AttractionController_12, AdminController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login(user:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/images/", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegisterController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchBarController.search(find:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getWishList""", """controllers.WishListController.getWishList(userID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAlbums""", """controllers.AlbumController.getAlbums(userID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPictures""", """controllers.PictureController.getPictures(albumID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getNotifications""", """controllers.NotificationsController.getNotifications(userID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProfileInfo""", """controllers.NewsfeedController.getProfileInfo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getNewsfeedInfo""", """controllers.NewsfeedController.getNewsfeedInfo(user:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getCalendar""", """controllers.CalendarController.getCalendar(userID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProfileCalendar""", """controllers.CalendarController.getProfileCalendar(userID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAttractions""", """controllers.AttractionController.getAttractions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAttractionsDetail""", """controllers.AttractionController.getAttractionsDetail(attractionID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAdmin""", """controllers.AdminController.getAdmin"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_11.login(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Login Controller""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_9.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Image Controller """,
      this.prefix + """images/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RegisterController_register2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegisterController_register2_invoker = createInvoker(
    RegisterController_5.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisterController",
      "register",
      Nil,
      "GET",
      """ Register Controller""",
      this.prefix + """register"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SearchBarController_search3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchBarController_search3_invoker = createInvoker(
    SearchBarController_10.search(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchBarController",
      "search",
      Seq(classOf[String]),
      "GET",
      """ Search Bar""",
      this.prefix + """search"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProfileController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_profile4_invoker = createInvoker(
    ProfileController_4.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "profile",
      Nil,
      "GET",
      """ Profile Controller""",
      this.prefix + """profile"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_WishListController_getWishList5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getWishList")))
  )
  private[this] lazy val controllers_WishListController_getWishList5_invoker = createInvoker(
    WishListController_6.getWishList(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WishListController",
      "getWishList",
      Seq(classOf[Integer]),
      "GET",
      """ Wish List Controller""",
      this.prefix + """getWishList"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AlbumController_getAlbums6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAlbums")))
  )
  private[this] lazy val controllers_AlbumController_getAlbums6_invoker = createInvoker(
    AlbumController_1.getAlbums(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AlbumController",
      "getAlbums",
      Seq(classOf[Integer]),
      "GET",
      """ Album Controller""",
      this.prefix + """getAlbums"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PictureController_getPictures7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPictures")))
  )
  private[this] lazy val controllers_PictureController_getPictures7_invoker = createInvoker(
    PictureController_3.getPictures(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PictureController",
      "getPictures",
      Seq(classOf[Integer]),
      "GET",
      """ Picture Controller""",
      this.prefix + """getPictures"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_NotificationsController_getNotifications8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getNotifications")))
  )
  private[this] lazy val controllers_NotificationsController_getNotifications8_invoker = createInvoker(
    NotificationsController_2.getNotifications(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NotificationsController",
      "getNotifications",
      Seq(classOf[Integer]),
      "GET",
      """ Notifications Controller""",
      this.prefix + """getNotifications"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_NewsfeedController_getProfileInfo9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProfileInfo")))
  )
  private[this] lazy val controllers_NewsfeedController_getProfileInfo9_invoker = createInvoker(
    NewsfeedController_8.getProfileInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsfeedController",
      "getProfileInfo",
      Nil,
      "GET",
      """ Newsfeed Controller""",
      this.prefix + """getProfileInfo"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_NewsfeedController_getNewsfeedInfo10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getNewsfeedInfo")))
  )
  private[this] lazy val controllers_NewsfeedController_getNewsfeedInfo10_invoker = createInvoker(
    NewsfeedController_8.getNewsfeedInfo(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsfeedController",
      "getNewsfeedInfo",
      Seq(classOf[Integer]),
      "GET",
      """ Newsfeed Controller""",
      this.prefix + """getNewsfeedInfo"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CalendarController_getCalendar11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getCalendar")))
  )
  private[this] lazy val controllers_CalendarController_getCalendar11_invoker = createInvoker(
    CalendarController_7.getCalendar(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalendarController",
      "getCalendar",
      Seq(classOf[Integer]),
      "GET",
      """ Calendar Controller""",
      this.prefix + """getCalendar"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CalendarController_getProfileCalendar12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProfileCalendar")))
  )
  private[this] lazy val controllers_CalendarController_getProfileCalendar12_invoker = createInvoker(
    CalendarController_7.getProfileCalendar(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalendarController",
      "getProfileCalendar",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """getProfileCalendar"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_AttractionController_getAttractions13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAttractions")))
  )
  private[this] lazy val controllers_AttractionController_getAttractions13_invoker = createInvoker(
    AttractionController_12.getAttractions,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttractionController",
      "getAttractions",
      Nil,
      "GET",
      """ Attractions Controller""",
      this.prefix + """getAttractions"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_AttractionController_getAttractionsDetail14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAttractionsDetail")))
  )
  private[this] lazy val controllers_AttractionController_getAttractionsDetail14_invoker = createInvoker(
    AttractionController_12.getAttractionsDetail(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttractionController",
      "getAttractionsDetail",
      Seq(classOf[Integer]),
      "GET",
      """ Attractions Controller""",
      this.prefix + """getAttractionsDetail"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_AdminController_getAdmin15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAdmin")))
  )
  private[this] lazy val controllers_AdminController_getAdmin15_invoker = createInvoker(
    AdminController_0.getAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getAdmin",
      Nil,
      "GET",
      """ Admin Controller""",
      this.prefix + """getAdmin"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_LoginController_login0_route(params) =>
      call(params.fromQuery[String]("user", None), params.fromQuery[String]("password", None)) { (user, password) =>
        controllers_LoginController_login0_invoker.call(LoginController_11.login(user, password))
      }
  
    // @LINE:11
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public/images/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_9.at(path, file))
      }
  
    // @LINE:14
    case controllers_RegisterController_register2_route(params) =>
      call { 
        controllers_RegisterController_register2_invoker.call(RegisterController_5.register)
      }
  
    // @LINE:17
    case controllers_SearchBarController_search3_route(params) =>
      call(params.fromQuery[String]("find", None)) { (find) =>
        controllers_SearchBarController_search3_invoker.call(SearchBarController_10.search(find))
      }
  
    // @LINE:20
    case controllers_ProfileController_profile4_route(params) =>
      call { 
        controllers_ProfileController_profile4_invoker.call(ProfileController_4.profile)
      }
  
    // @LINE:23
    case controllers_WishListController_getWishList5_route(params) =>
      call(params.fromQuery[Integer]("userID", None)) { (userID) =>
        controllers_WishListController_getWishList5_invoker.call(WishListController_6.getWishList(userID))
      }
  
    // @LINE:26
    case controllers_AlbumController_getAlbums6_route(params) =>
      call(params.fromQuery[Integer]("userID", None)) { (userID) =>
        controllers_AlbumController_getAlbums6_invoker.call(AlbumController_1.getAlbums(userID))
      }
  
    // @LINE:29
    case controllers_PictureController_getPictures7_route(params) =>
      call(params.fromQuery[Integer]("albumID", None)) { (albumID) =>
        controllers_PictureController_getPictures7_invoker.call(PictureController_3.getPictures(albumID))
      }
  
    // @LINE:32
    case controllers_NotificationsController_getNotifications8_route(params) =>
      call(params.fromQuery[Integer]("userID", None)) { (userID) =>
        controllers_NotificationsController_getNotifications8_invoker.call(NotificationsController_2.getNotifications(userID))
      }
  
    // @LINE:35
    case controllers_NewsfeedController_getProfileInfo9_route(params) =>
      call { 
        controllers_NewsfeedController_getProfileInfo9_invoker.call(NewsfeedController_8.getProfileInfo)
      }
  
    // @LINE:38
    case controllers_NewsfeedController_getNewsfeedInfo10_route(params) =>
      call(params.fromQuery[Integer]("user", None)) { (user) =>
        controllers_NewsfeedController_getNewsfeedInfo10_invoker.call(NewsfeedController_8.getNewsfeedInfo(user))
      }
  
    // @LINE:41
    case controllers_CalendarController_getCalendar11_route(params) =>
      call(params.fromQuery[Integer]("userID", None)) { (userID) =>
        controllers_CalendarController_getCalendar11_invoker.call(CalendarController_7.getCalendar(userID))
      }
  
    // @LINE:43
    case controllers_CalendarController_getProfileCalendar12_route(params) =>
      call(params.fromQuery[Integer]("userID", None)) { (userID) =>
        controllers_CalendarController_getProfileCalendar12_invoker.call(CalendarController_7.getProfileCalendar(userID))
      }
  
    // @LINE:47
    case controllers_AttractionController_getAttractions13_route(params) =>
      call { 
        controllers_AttractionController_getAttractions13_invoker.call(AttractionController_12.getAttractions)
      }
  
    // @LINE:50
    case controllers_AttractionController_getAttractionsDetail14_route(params) =>
      call(params.fromQuery[Integer]("attractionID", None)) { (attractionID) =>
        controllers_AttractionController_getAttractionsDetail14_invoker.call(AttractionController_12.getAttractionsDetail(attractionID))
      }
  
    // @LINE:53
    case controllers_AdminController_getAdmin15_route(params) =>
      call { 
        controllers_AdminController_getAdmin15_invoker.call(AdminController_0.getAdmin)
      }
  }
}
