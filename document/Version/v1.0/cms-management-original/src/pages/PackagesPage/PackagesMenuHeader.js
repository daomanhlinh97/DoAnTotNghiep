import React, { Component } from "react";
import { Route, Link } from "react-router-dom";

const menus = [
  { name: "Packages", icon: "gift", exact: "false", to: "/packages" },
  { name: "Intalled", icon: "download", exact: "false", to: "/packages/installed" },
  { name: "Intall local", icon: "cloud-download", exact: "false", to: "/packages/local" },
  { name: "Created", icon: "file", exact: "false", to: "/packages/created" }
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

class PackagesMenuHeader extends Component {
    render() {
      return(
       <nav class="navbar-whitebackground">
         <div class="container-fluid">
           < div class="navbar-header">
             <a class="navbar-brand title-brand" href="#">Packages</a>
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
 
 export default PackagesMenuHeader;