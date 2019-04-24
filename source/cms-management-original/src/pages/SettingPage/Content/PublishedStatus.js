import React, { Component } from "react";

class PublishedStatus extends Component
{
    render()
    {
        return(
            <form className = "form-published height-200">
               <form className = "form-son">
                    <label className = "lable-header lable-common">Published Status</label>
                    <br></br>
                    <p className = "lable-common lable-10px">You are running the brand new NuCache!</p>
                    <form>
                    NuCache says: I'm feeling good, really. Database cache is ok. ContentStore has 1 generation, 1 snapshot and 21 entries. MediaStore has 1 generation, 1 snapshot and 17 entries.
                    </form>
                    <p className = "lable-common lable-10px">This lets you refresh the status, or collect snapshots (after running a CLR GC).</p>
                    <button className = "button-ref-col-re">Refresh</button>
                    <button className = "button-ref-col-re">Collect</button>
                    <p className = "lable-common lable-10px">This lets you rebuild the database cache (status above), ie the content of the cmsContentNu table. Rebuilding can be expensive.</p>
                    <button className = "button-ref-col-re">Rebuild</button>
                    <p className = "lable-common lable-10px">This lets you reload the in-memory and local file cache by entirely reloading it from the data in the cmsContentNu table, but it does not rebuild that table. This is relatively fast. Triggers the reload on all servers in an LB environment.</p>
                    <button className = "button-ref-col-re">Reload</button>
                </form>
            </form>
        )
    }
}

export default PublishedStatus;