(ns app.components.main-view
  (:require [re-frame.core :as rf]
            [app.components.menu :refer [menu]]
            [app.components.about :refer [about]]
            [app.components.footer :refer [footer]]))

(defn splash []
  [:div {:style {:background-color "magenta"

                 :overflow "hidden"
                 :width "100%"
                 :height "100%"}}
   [:div {:style {:background "url(./img/di.JPG) no-repeat top right"
                  :overflow "hidden"
                  :min-width "100%"
                  :opacity ".6"
                  :max-height "50%"
                  :min-height "50%"}}
    [:img {:src "./img/di.JPG"
           :style {:opacity ".5"
                  ; :background url (images/img06.gif) no-repeat top right;

                   :overflow "hidden"
                   :min-width "100%"
                   :min-height "50%"
                   :max-height "50%"
                   :top "0"
                   :transition "wiggle"}}]]])
(defn app []
  ; (let [page-kw @(rf/subscribe [:page])]
  (splash))

    ; [:<>
    ;  (menu)
    ;  [:main (case page-kw
    ;           :about (about)
    ;           :exercise [:h1 "Exercise string"]
    ;           [:div])]
    ;  (footer)]))
