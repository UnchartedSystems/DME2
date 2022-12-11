(ns frontend.pages.home
  (:require [reagent.core :as r]))

(def lorum "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis ullamcorper urna sed blandit pretium.")

(defn home-card [name]
  [:div {:class "bg-[#fff] rounded-md shadow"}
   [:div.p-3 {:class "flex items-baseline"}
    [:h1 {:class "flex-auto"} name]
    [:input.flex.none {:type "button"
                       :value "Start"
                       :class "bg-[#0f82ba] text-white rounded px-2 py-1"}]]
   [:p.p-3 #_{:class "bg-[#f9f9f9] p-3"} lorum]])


(defn page []
  [:div {:class "container"}
   [:div {:class "mt-20 grid grid-cols-4 gap-4"}
    [home-card "Hello World"]
    ]])
