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
        <div id="content">
        <div className = "row save-publish-top">
          <table>
            <tr>
              <td className = "col-row-td-input">
                <input type = "text" className = "input-edit-name" value = "Home"></input>
              </td>
              <td>
              
              <div class="dropdown">
             
              <i className={`fa fa-bell`} />
              <button ><div><span className = "span-package">Content</span></div></button>
                  
                    <div class="dropdown-content">
                    <a href="#">Hero</a>
                    <a href="#">Header</a>
                    <a href="#">Body</a>
                    <a href="#">Footer</a>
  </div>
</div>
                
              </td>
              <td>
              <div class="dropdown">
              <i className={`fa fa-file`} />
              <button ><div><span className = "span-package">Info</span></div></button>
                </div>
              </td>
              <td>
              <div class="dropdown">
              <i className={`fa fa-file`} />
              <button ><div><span className = "span-package">Action</span></div></button>
              <div class="dropdown-content">
                    <a href="#">Create</a>
                    <a href="#">Move</a>
                    <a href="#">Delete</a>
                    <a href="#">Copy</a>
                    <a href="#">Reload</a>
  </div>
                </div>
                </td>
            </tr>
          </table>
        </div>
        </div>
      );
   }
   
 }
 
 export default ContentMenuHeader;