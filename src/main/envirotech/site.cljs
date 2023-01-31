(ns envirotech.site
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [envirotech.route :refer (route)]
            [envirotech.test :as test]
            [envirotech.body :as body]))

;; npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch

(defn frame [text]
  [:div.mx-5
   [:div {:class [:container "max-w-[73ch]"]}
    [text]]])

(defn root-element []
  [:div
   #_[nav-bar]
   #_[test/sample]
   #_[routing]
   [frame body/text]])

(defn ^:dev/after-load start []
  (rdom/render
   [:div {:class "bg-[#fff] w-full"} [root-element]]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  #_(js/console.log "stop"))
