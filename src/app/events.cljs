(ns app.events
  (:require [re-frame.core :as rf]))

(rf/reg-event-db
 :set-page
 (fn [db [_ {:keys [handler]}]]
   (assoc db :page handler)))
