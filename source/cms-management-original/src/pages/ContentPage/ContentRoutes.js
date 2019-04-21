import React from "react";

import Home from "../../components/Content/Home";
import Contact from "../../components/Content/Contact";

const ContentRoutes = [
  {
    path: "/",
    main: () => <Home />
  },
  {
    path: "/content/home",
    main: () => <Home />
  },
  {
    path: "/content/contact",
    main: () => <Contact />
  }
];

export default ContentRoutes;
