/* eslint-disable react/display-name */
import React from "react";
import ContentPage from "./pages/ContentPage/ContentPage";
import MediaPage from "./pages/MediaPage/MediaPage";
import SettingPage from "./pages/SettingPage/SettingPage";
import UserPage from "./pages/UserPage/UserPage";
import FormPage from "./pages/FormPage/FormPage";
import PackagesPage from "./pages/PackagesPage/PackagesPage";

const routes = [
  {
    path: "/",
    main: () => <ContentPage />
  },
  {
    path: "/media",
    main: () => <MediaPage />
  },
  {
    path: "/setting",
    main: () => <SettingPage />
  },
  {
    path: "/packages",
    main: () => <PackagesPage />
  },
  {
    path: "/users",
    main: () => <UserPage />
  },
  {
    path: "/forms",
    main: () => <FormPage />
  }
];

export default routes;
