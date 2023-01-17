(ns envirotech.site
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [envirotech.route :refer (route)]
            [envirotech.test :as test]
            [envirotech.body :as body]))

;; npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch

(defn routing []
  [:div
   (cond (= @route :main)       [:h1 "main"]
         (= @route :bitumen)   [:h1 "bitumen"]
	       (= @route :hydrogen)    [:h1 "hydrogen"])])


(defn nav-button [val page]
  [:input {:type "Button"
	         :value val
           :read-only true
           :on-click #(reset! route page)}])

(defn nav-bar []
  [:div
   [nav-button "Main" :main]
   [nav-button "bitumen" :bitumen]
   [nav-button "hydrogen" :hydrogen]])

(defn root-element []
  [:div
   #_[nav-bar]
   [test/sample]
   #_[routing]
   #_[body/text]])


(defn ^:dev/after-load start []
  (rdom/render
   [:div {:class "bg-[#fff] w-full"} [root-element]]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  #_(js/console.log "stop"))
