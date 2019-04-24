import React, { Component } from "react";

class ExamineManagement extends Component
{
    render()
    {
        return(
            <form className = "form-exa height-200">
               <form className = "form-exa-1">
               <label className = "lable-header lable-common">Examine Management</label>
               </form>
               <br></br>
               <form className = "form-exa-1">
                    <form className = "form-exa-1-2">
                        <label className = "lable-common">Indexers</label>
                    </form>
                    <label className = "lable-bold lable-common lable-10px">Manage Examine's indexes</label>
                    <br></br>
                    <label className = "lable-font-w-800">Allows you to view the details of each index and provides some tools for managing the indexes</label>
                </form>   
                <br></br>
               <form className = "form-exa-1">
                    <form className = "form-exa-1-2">
                        <label className = "lable-common">Searchers</label>
                    </form>
                    <label className = "lable-bold lable-common lable-10px">Configured Searchers</label>
                    <br></br>
                    <label className = "lable-font-w-800">Shows properties and tools for any configured Searcher (i.e. such as a multi-index searcher)</label>
                </form>   
            </form>
        )
    }
}

export default ExamineManagement;