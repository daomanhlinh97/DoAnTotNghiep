

import React, { Component } from "react";

import { Switch, Route, BrowserRouter as Router } from "react-router-dom";
import SidebarContent from "../../components/Content/Sidebar/Sidebar";
import routes from "./ContentRoutes";
import ContentMenuHeader from "./ContentMenuHeader"

class ContentPage extends Component {
  render() {
    return (
      <Router>
          <SidebarContent />
          {this.showContentMenu(routes)}
       
      </Router>
    );
  }

  showContentMenu = routes => {
    let result = null;
    if (routes.length > 0) {
      result = routes.map((route, index) => {
        console.log(route.path + " this");
        return <Route key={index} path={route.path} component={route.main} />;
      });
    }
    return <Switch>{result}</Switch>;
  };
}

export default ContentPage;
