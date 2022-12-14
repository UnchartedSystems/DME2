(ns envirotech.site
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [envirotech.body :as page]))

;; npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch
(defonce route (r/atom :main))

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
   [nav-button "hydrogen" :hydrogen]
   ])

(defn root-element []
  [:div
   #_[nav-bar]
   #_[routing]])


(defn ^:dev/after-load start []
  (rdom/render
   [:div {:class "bg-[#ececec] w-full h-screen"} [root-element]]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  #_(js/console.log "stop"))
