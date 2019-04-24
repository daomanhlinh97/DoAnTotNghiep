import React, { Component } from "react";

import { Switch, Route, BrowserRouter as Router } from "react-router-dom";
import SidebarSetting from "./Content/SettingSlideBar";
import SettingMenuHeader from "./SettingMenuHeader";
import SettingPageRouter from "./SettingPageRouter";

class SettingPage extends Component {
  render() {
    return (
      <Router>
        <SettingMenuHeader/>
        <table className = "table-setting">
          <tr>
            <td className = "td-w-20" rowSpan = "2">
              <SidebarSetting/>
            </td>
            <td className = "td-w-80 td-h-20">
            {this.showContentMenu(SettingPageRouter)}
            </td>
          </tr>
          <tr>
            <td >
            </td>
          </tr>
        </table>
        
      </Router>
    );
  }
  showContentMenu = SettingPageRouter => {
    let result = null;
    if (SettingPageRouter.length > 0) {
      result = SettingPageRouter.map((SettingPageRouter, index) => {
        return <Route key={index} path={SettingPageRouter.path} component={SettingPageRouter.main} />;
      });
    }
    return <Switch>{result}</Switch>;
  };
}

export default SettingPage;
