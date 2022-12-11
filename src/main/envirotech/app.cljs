(ns envirotech.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

;; npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch
(defonce route (r/atom :main))

#_(defn routing []
  [:div
   (cond (= @route :main)       [home/page]
         (= @route :settings)   [settings/page]
	       (= @route :profile)    [profile/page]
         (= @route :languages)  [languages/page])])

(defn routing []
  [:div
   (cond (= @route :main)       [:h1 "main"]
         (= @route :settings)   [:h1 "settings"]
	       (= @route :profile)    [:h1 "profile"]
         (= @route :languages)  [:h1 "langs"])])


(defn nav-button [val page]
  [:input {:type "Button"
	         :value val
           :read-only true
           :on-click #(reset! route page)}])

(defn nav-bar []
  [:div
   [nav-button "Main" :main]
   [nav-button "Settings" :settings]
   [nav-button "Profile" :profile]
   [nav-button "Languages" :languages]])

(defn root-element []
  [:div
   [nav-bar]
   [routing]])


(defn ^:dev/after-load start []
  (rdom/render
   [:div {:class "bg-[#ececec] w-full h-screen"} [root-element]]
   (.-body js/document)))

(defn init []
  (start))

(defn ^:dev/before-load stop []
  #_(js/console.log "stop"))
