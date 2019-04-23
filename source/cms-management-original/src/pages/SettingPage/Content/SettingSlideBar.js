/* eslint-disable jsx-a11y/anchor-is-valid */
/* eslint-disable react/prop-types */
/* eslint-disable react/no-children-prop */
import React, { Component } from "react";
import { Link } from "react-router-dom";
import DocumentType from "../DocumentType";
import MediaType from "../MediaType";
import ContentTemplate from "../ContentTemplate";
import MemberType from "../MemberType";
import DataType from "../DataType";
import Macros from "../Macros";
import RelationType from "../RelationType";
import Logview from "../LogView";
import Langauges from "../Languages";
import "../Content/Style.css"
import languages from "../Languages";

let lastScrollY = 0;
let ticking = false;

class SettingSideBar extends Component {

  componentDidMount() {
    window.addEventListener('scroll', this.handleScroll);
  }

  componentWillUnmount() {
    window.removeEventListener('scroll', this.handleScroll);
  }
    
  nav = React.createRef();
  
  handleScroll = () => {
    lastScrollY = window.scrollY;

    if (!ticking) {
      window.requestAnimationFrame(() => {
        this.nav.current.style.top = `${lastScrollY}px`;
        ticking = false;
      });
   
      ticking = true;
    }
  };

  render() {
    return (
      <div className="wrapper">
      <nav className = "sidebar" >
        <ul className="list-unstyled components">
          <DocumentType/>
          <MediaType/>
          <MemberType/>
          <DataType/>
          <Macros/>
          <RelationType/>
          <Logview/>
          <Langauges/>
          <ContentTemplate/>
        </ul>
      </nav>
      </div>
    );
  }
}

export default SettingSideBar;
