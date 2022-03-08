import React from "react";
import ErrorLogPane from "../components/ErrorLogPane/ErrorLogPane";
import NavigationPane from "../components/NavigationPane/NavigationPane";
import "./DashboardScreen.css";

function DashboardScreen() {
  return (
    <div className="DashboardScreen">
      <div className="DashboardScreen__NavigationPane">
        <NavigationPane />
      </div>
      <div className="DashboardScreen__ErrorLog">
        <ErrorLogPane />
      </div>
      Pane
    </div>
  );
}

export default DashboardScreen;