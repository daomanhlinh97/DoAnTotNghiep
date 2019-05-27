import React from "react";
import ContentPage from "./pages/ContentPage/ContentPage";
import MediaPage from "./pages/MediaPage/MediaPage";
import SettingPage from "./pages/SettingPage/SettingPage";
import UserPage from "./pages/UserPage/UserPage";
import Login2 from "./pages/LoginPage/Login2";
import PackagesPage from "./pages/PackagesPage/PackagesPage";
import LoginPage from "./pages/LoginPage/LoginPage";


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
    main: () => <LoginPage />
  },
  {
    path: "/packages",
    main: () => <PackagesPage/>
  },
  {
    path: "/packages/installed",
    main: () => <PackagesPage/>
  },
  {
    path: "/packages/local",
    main: () => <PackagesPage/>
  },
  {
    path: "/packages/created",
    main: () => <PackagesPage/>
  },
  {
    path: "/setting",
    main: () => <SettingPage />
  },
  {
    path: "/setting/exam",
    main: () => <SettingPage />
  },
  {
    path: "/setting/pub",
    main: () => <SettingPage />
  },
  {
    path: "/setting/mod",
    main: () => <SettingPage />
  },
  {
      path: "/setting/Hea",
      main: () => <SettingPage />
  }
];

export default routes;