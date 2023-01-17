(ns envirotech.test
  (:require [envirotech.macros :refer (p)]))


(defn sample []
  [:div.container.py-10
   [:h1 "A Breakthrough Technology for In-Situ Bitumen Recovery"]
   [p "Our global energy system faces stark challenges on the horizon. "
    "Fulfilling the generational promise of reducing poverty and creating prosperity requires an abundance of cheap energy; but the growing threat of climate change demands that we transition to cleaner and more  sustainable forms of energy. "
    "Oil will likely still play a vital role in our global energy system for the forseeable future"
    [:a {:href "https://www.eia.gov/todayinenergy/detail.php?id=41433"} "source"]
    " ; and so it is imperative that we begin the transition to cheaper and cleaner forms of oil recovery today."]

   [p "The " [:em "Steam Assisted Gravity Drainage (SAGD)"]  "technology that  powered the rise of the oil sands for over three decades has become the  root of problems that now threaten the continued survival of the  Canadian oil sands industry. "
    "Recovering unrefined bitumen using SAGD has a host of growing disadvantages ; the process is complex, costly, and  energy intensive. "
    "The high CO2 emissions and poor  environmental record of SAGD has resulted in a growing political  backlash that is cutting off opportunities for continued growth. "]
   [p "The " [:em "Dimethyl Ether (DME)"] " based recovery technology outlined  here can become an engine of clean, sustainable growth for the Canadian  oil sands for decades to come. "
    "Dimethyl Ether is an amphoteric solvent that displays particular affinity to bitumen. "
    "In this outline we will  see how DME based extraction can dramatically improve the recovery rate and environmental impact, reduce the capital and operating costs, and simplify the process of bitumen recovery. "
    "We appeal to the Canadian oil sands industry and the governments of Alberta and Canada to work together to demonstrate the effectiveness of this technology in order to foster a new era for the bitumen industry. "]
   [p [:em "All claims and figures are discussed in detail in the PDF resources located at the bottom of the page."]]])
