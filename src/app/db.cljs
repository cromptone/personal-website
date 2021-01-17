(ns app.db
  (:require [re-frame.core :as rf]))

(defn initial-app-db []
  {:vocab-lists "foobar"})

(rf/reg-event-db :initialize-db (fn [_ _] (initial-app-db)))
