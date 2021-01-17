(ns app.subs
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 :page
 (fn [db _]
   (:page db)))
