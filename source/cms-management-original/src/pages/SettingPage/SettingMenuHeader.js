import React, { Component } from "react";
import { Route, Link } from "react-router-dom";
import "./Content/Style.css"

const menus = [
  { name: "Welcome", exact: "false", to: "/setting" },
  { name: "Examine Management",  exact: "false", to: "/setting/exam" },
  { name: "Published Status",  exact: "false", to: "/setting/pub" },
  { name: "Models Builder",  exact: "false", to: "/setting/mod" },
  { name: "Health Check",  exact: "false", to: "/setting/Hea" }
];

const MenuLink = ({ label, to, icon, exact }) => {
  return (
    <Route
      path={to}
      exact={exact}
      children={({ match }) => {
        let active = match ? "active" : "";
        return (
          <li className={`nav-item ${active}`}>
            <Link to={to} className="nav-link nav-link-package">
              <i className={`fa fa-${icon} fa-fa-icon`} />
              <div><span className = "span-package">{label}</span></div>
            </Link>
          </li>
        );
      }}
    />
  );
};

class SettingMenuHeader extends Component {
  render() {
    return(
     <nav class="navbar-whitebackground-setting">
       <div class="container-fluid">
         < div class="navbar-header">
           <a class="navbar-brand title-brand" href="/setting">Setting</a>
         </div>
         <ul class="nav navbar-nav navbar-right nav-package">
           {this.showMenu(menus)}
         </ul>
       </div>
     </nav>
    );
 }
 showMenu = menus => {
  var result = null;
  if (menus.length > 0) {
    result = menus.map((menu, index) => {
      return (
        <MenuLink
          key={index}
          exact={menu.exact}
          label={menu.name}
          to={menu.to}
        />
      );
    });
  }
  return result;
};
}
 
 export default SettingMenuHeader;