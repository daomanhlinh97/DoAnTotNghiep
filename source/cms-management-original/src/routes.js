import React from "react";
import ContentPage from "./pages/ContentPage/ContentPage";
import MediaPage from "./pages/MediaPage/MediaPage";
import SettingPage from "./pages/SettingPage/SettingPage";
import UserPage from "./pages/UserPage/UserPage";
import FormPage from "./pages/FormPage/FormPage";
import PackagesPage from "./pages/PackagesPage/PackagesPage";
import CreatedChildPage from "./pages/PackagesPage/ChildPage/CreatedChildPage";
import LocalChildPage from "./pages/PackagesPage/ChildPage/LocalChildPage";
import PackagesChildPage from "./pages/PackagesPage/ChildPage/PackagesChildPage";
import InstalledChildPage from "./pages/PackagesPage/ChildPage/InstalledChildPage";
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
  }
];

export default routes;