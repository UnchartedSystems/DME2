(ns envirotech.elements)

(defn p [& contents]
  (apply conj [:p {:class []}] contents))
