import React from "react";
import ContentDefaultWel from "./Content/ContentDefaultWel";
import ModelsBuilder from "./Content/ModelsBuilder";
import HealthCheck from "./Content/HealthCheck";
import ExamineManagement from "./Content/ExamineManagement";
import PublishedStatus from "./Content/PublishedStatus";

const SettingPageRouter = [
    {
      path: "/setting",
      main: () => <ContentDefaultWel/>
    },
    {
      path: "/setting/exam",
      main: () => <ExamineManagement/>
    },
    {
      path: "/setting/pub",
      main: () => <PublishedStatus/>
    },
    {
      path: "/setting/mod",
      main: () => <ModelsBuilder/>
    },
    {
        path: "/setting/Hea",
        main: () => <HealthCheck/>
    }
  ];
  
  export default SettingPageRouter;