import React, { Component } from "react";
import "./PackagesMenuHeader"
import PackagesMenuHeader from "./PackagesMenuHeader";
import PackagesRoutes from "./PackagesRoutes";
import PackagesSearch from "./PackagesSearch";
import { Switch, Route, BrowserRouter as Router } from "react-router-dom";

class PackagesPage extends Component {
   render() {
     return(
       <Router>
          <PackagesMenuHeader/>
          {this.showContentMenu(PackagesRoutes)}
       </Router>
     );
  }

  showContentMenu = PackagesRoutes => {
    let result = null;
    if (PackagesRoutes.length > 0) {
      result = PackagesRoutes.map((PackagesRoutes, index) => {
        return <Route key={index} path={PackagesRoutes.path} component={PackagesRoutes.main} />;
      });
    }
    return <Switch>{result}</Switch>;
  };

}

export default PackagesPage;
