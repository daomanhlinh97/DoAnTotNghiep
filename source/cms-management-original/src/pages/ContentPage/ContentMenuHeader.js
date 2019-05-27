import React, { Component } from "react";
import { Route, Link } from "react-router-dom";

const menus = [
  { name: "Content", icon: "gift", exact: "false", to: "/packages" },
  { name: "Info", icon: "download", exact: "false", to: "/packages/installed" },
  { name: "Action", icon: "cloud-download", exact: "false", to: "/packages/local" },
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

class ContentMenuHeader extends Component {
    render() {
      return(
       <nav class="navbar-whitebackground-content">
         <div class="container-fluid">
           < div class="navbar-header">
             <a class="navbar-brand title-brand" href="/packages">Content</a>
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
             icon={menu.icon}
           />
         );
       });
     }
     return result;
   };
 }
 
 export default ContentMenuHeader;