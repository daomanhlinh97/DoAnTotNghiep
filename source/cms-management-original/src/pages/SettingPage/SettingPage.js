import React, { Component } from "react";

import { Switch, Route, BrowserRouter as Router } from "react-router-dom";
import SidebarSetting from "./Content/SettingSlideBar";
import SettingMenuHeader from "./SettingMenuHeader";
import ContentDefaultWel from "./Content/ContentDefaultWel"

class SettingPage extends Component {
  render() {
    return (
      <div>
        <SettingMenuHeader/>
        <table className = "table-setting">
          <tr>
            <td className = "td-w-20" rowSpan = "2">
              <SidebarSetting/>
            </td>
            <td className = "td-w-80 td-h-20">
              <ContentDefaultWel/>
            </td>
          </tr>
          <tr>
            <td >
            </td>
          </tr>
        </table>
        
      </div>
    );
  }
}

export default SettingPage;
