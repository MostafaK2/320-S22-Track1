import React from "react";
import ErrorLogBox from "../ErrorLogBox/ErrorLogBox";

function ErrorLogPane() {
  let arr = ["hi"];
  return (
    <div>
      <div className="ErrorLogPane">
        <h1 className="ErrorLogPane__heading">Recent Error Logs</h1>
        {arr.map((x) => (
          <ErrorLogBox></ErrorLogBox>
        ))}
      </div>
    </div>
  );
}

export default ErrorLogPane;