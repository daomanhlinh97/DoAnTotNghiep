import React, { Component } from "react";

import { Switch, Route, BrowserRouter as Router } from "react-router-dom";
import SidebarSetting from "./Content/SettingSlideBar";
import SettingMenuHeader from "./SettingMenuHeader";

class SettingPage extends Component {
  render() {
    return (
      <div>
          <SettingMenuHeader/>
          <SidebarSetting />
      </div>
    );
  }
}

export default SettingPage;
