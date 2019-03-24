import React from "react";
import CreatedChildPage from "./ChildPage/CreatedChildPage";
import LocalChildPage from "./ChildPage/LocalChildPage";
import PackagesChildPage from "./ChildPage/PackagesChildPage";
import InstalledChildPage from "./ChildPage/InstalledChildPage";

const PackagesRoutes = [
    {
      path: "/packages",
      main: () => <PackagesChildPage/>
    },
    {
      path: "/packages/installed",
      main: () => <InstalledChildPage/>
    },
    {
      path: "/packages/local",
      main: () => <LocalChildPage/>
    },
    {
      path: "/packages/created",
      main: () => <CreatedChildPage/>
    }
  ];
  
  export default PackagesRoutes;