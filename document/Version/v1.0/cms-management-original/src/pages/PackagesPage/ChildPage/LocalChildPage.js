import React, { Component } from "react";

class LocalChildPage extends Component
{
    render()
    {
        return (
            <div>
             
              <form className = "form-local">
                <form className = "icon-box"></form>
                <div><label className = "lable-after-icon-box">Drop to Upload</label></div>
                <label className = "label-local">click here to choose package file</label>
                <label className = "title-local">Upload package</label>
                <div>
                  <label className = "last-label-local">
                    Install a local package by selecting it from your machine. Only install packages from sources you know and trust.
                  </label>
                </div>
              </form>
            </div>
        );
    }
}

export default LocalChildPage;